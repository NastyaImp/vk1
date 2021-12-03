package ru.netology.domain;

public class Post {
    private int id;
    private Title title;
    private Footer footer;
    private MainInformation mainInformation;


    public class Title {

        private String imageUrl;
        private String title;
        private int date;
        private boolean hideText;
    }

    public class Footer {
        private Like like;
        private Comment comment;
        private Repost repost;
        private View view;
    }

    public class Like {
        private int count;
        private int idAuthor;
        private boolean userLike;
    }

    public class Comment {
        private int count;
        private int idAuthor;
        private String textComment;
    }

    public class Repost {
        private int count;
        private int idUser;
    }

    public class View {
        private int count;
    }

    public class MainInformation {
        private String information;
        private String imageUrl;
        private String reference;
    }
    // + get и set на все
}

