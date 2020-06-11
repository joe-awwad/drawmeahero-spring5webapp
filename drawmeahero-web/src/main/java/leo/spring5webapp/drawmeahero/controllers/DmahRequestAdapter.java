package leo.spring5webapp.drawmeahero.controllers;

import leo.spring5webapp.drawmeahero.model.*;

import java.util.stream.Collectors;

public class DmahRequestAdapter {

    public static HeroOrder adapt(DmahRequest request) {
        Requester requester = new Requester();
        requester.setFirstName(request.getFirstName());
        requester.setLastName(request.getLastName());
        requester.setEmail(request.getEmail());

        HeroOrder heroOrder = new HeroOrder();
        heroOrder.setRequester(requester);
        heroOrder.setForRequester(request.isForRequester());

        if (heroOrder.isForRequester()) {
            heroOrder.setRequesteeName(heroOrder.getRequester().getFirstName() + ' ' + heroOrder.getRequester().getLastName());
        } else {
            heroOrder.setRequesteeName(request.getRequesteeName());
        }

        heroOrder.setDislikes(request.getDislikes().stream().map(dislike -> {
            Dislike d = new Dislike();
            d.setDescription(dislike);
            return d;
        }).collect(Collectors.toList()));

        heroOrder.setLikes(request.getLikes().stream().map(like -> {
            Like d = new Like();
            d.setDescription(like);
            return d;
        }).collect(Collectors.toList()));

        heroOrder.setHabits(request.getHabits().stream().map(habit -> {
            Habit h = new Habit();
            h.setDescription(habit);
            return h;
        }).collect(Collectors.toList()));

        heroOrder.setQualities(request.getQualities().stream().map(quality -> {
            Quality q = new Quality();
            q.setDescription(quality);
            return q;
        }).collect(Collectors.toList()));

        heroOrder.setFavoriteColors(request.getFavoriteColors().stream().map(color -> {
            FavoriteColor c = new FavoriteColor();
            c.setColor(color);
            return c;
        }).collect(Collectors.toList()));
        return heroOrder;
    }
}
