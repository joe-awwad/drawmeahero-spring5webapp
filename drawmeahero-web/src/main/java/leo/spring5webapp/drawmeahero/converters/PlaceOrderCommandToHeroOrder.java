package leo.spring5webapp.drawmeahero.converters;

import leo.spring5webapp.drawmeahero.command.PlaceOrderCommand;
import leo.spring5webapp.drawmeahero.model.HeroOrder;
import leo.spring5webapp.drawmeahero.model.Image;
import org.bson.BsonBinarySubType;
import org.bson.types.Binary;
import org.springframework.beans.BeanUtils;
import org.springframework.core.convert.converter.Converter;

import java.util.stream.Collectors;

public class PlaceOrderCommandToHeroOrder implements Converter<PlaceOrderCommand, HeroOrder> {


    @Override
    public HeroOrder convert(PlaceOrderCommand source) {
        HeroOrder heroOrder = new HeroOrder();
        BeanUtils.copyProperties(source, heroOrder, "images");
        heroOrder.setImages(source.getImages()
                .stream()
                .map(image -> Image.builder()
                        .name(image.getName())
                        .type(image.getType())
                        .data(new Binary(BsonBinarySubType.BINARY, convert(image.getData())))
                        .build())
                .collect(Collectors.toSet()));
        return heroOrder;
    }

    private byte[] convert(String imageData) {
        if (imageData == null) {
            return new byte[0];
        }
        return imageData.getBytes();
    }
}
