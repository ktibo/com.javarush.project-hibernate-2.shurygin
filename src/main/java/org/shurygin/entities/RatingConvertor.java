package org.shurygin.entities;

import jakarta.persistence.AttributeConverter;
import jakarta.persistence.Converter;

@Converter(autoApply = true)
public class RatingConvertor implements AttributeConverter<Rating, String> {

    @Override
    public String convertToDatabaseColumn(Rating attribute) {
        return attribute.getValue();
    }

    @Override
    public Rating convertToEntityAttribute(String dbData) {
        Rating[] ratings = Rating.values();
        for (Rating rating : ratings) {
            if (dbData.equals(rating.getValue())) {
                return rating;
            }
        }
        return null;
    }
}
