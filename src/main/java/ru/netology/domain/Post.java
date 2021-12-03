package ru.netology.domain;

public class Post {
    private int id;
    private int ownerId;
    private int fromId;
    private int createdId;
    private Title title;
    private Footer footer;
    private MainInformation mainInformation;
    private Donut donut;


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
        private boolean canLike;

    }

    public class Comment {
        private int count;
        private int idAuthor;
        private String textComment;
        private boolean canPost;
        private boolean canClose;
        private boolean canOpen;

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

    public class Donut {
        private boolean isDonut;
        private int paidDuration;
        private boolean canPublishFreeCopy;
        private String editMode;
    }
    // + get и set на все
}


