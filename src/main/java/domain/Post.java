package domain;

public class Post {
    // Автор поста:
    private int groupId;            // айди группы, в которой конкретный пост размещен;
    private String creatorImageUrl; // иконка группы/юзера, который разместил пост;
    private String groupName;       // имя группы, в которой размещен пост;
    private String creatorLink;     // ссылка на группу/юзера, который разместил пост;

    // Конкретный пост:
    private int postId;             // айди поста;
    boolean AnchoredPost;           // пост может быть закреплен в группе;
    private int dropdownContent;    // содержимое дропдауна (пожаловаться и сохранить в закладках);

    private int date;               // дата размещения поста;
    private int time;               // время размещения поста;
    private String dateFilterUrl;   // ссылка на посты, отфильрованные по дате (при клике на дату поста);

    private String mainTextBlock;   // содержимое блока с текстом;
    private String mainImageUrl;    // изображение в посте;
    private String fullTextButton;  // для кнопки "Показать полностью";

    private int postLikesAmount;    // количество лайков поста;
    private int commentsAmount;     // количество комментариев;
    private int repostsAmount;      // количество репостов;
    private int viewsAmount;        // количество просмотров;

    // URL изображений иконок:
    private String likeButtonImageUrl;   // иконка кнопки "Наравится";
    private String pushedLikeButtonUrl;  // иконка кнопки "Нравится", когда она нажата;
    private String shareButtonIconUrl;   // иконка кнопки "Поделиться";
    private String viewsIconUrl;         // иконка для количества просмотров;

}



