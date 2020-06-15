public class Post {
    // Автор поста:
    private int groupId;            // айди группы, в которой конкретный пост размещен;
    private int creatorId;          // айди автора записи (от чьего имени опубликована запись);
    private int signerId;           // идентификатор автора, если запись была опубликована от имени сообщества и подписана пользователем;
    private int adminId;            // идентификатор администратора, который опубликовал запись;
    private String creatorImageUrl; // иконка группы/юзера, который разместил пост;
    private String groupName;       // имя группы, в которой размещен пост;
    private String creatorLink;     // ссылка на группу/юзера, который разместил пост;

    // Конкретный пост:
    private int postId;             // айди поста;
    private boolean AnchoredPost;   // пост может быть закреплен в группе;
    private boolean postSource;     // информация о способе размещения записи;
    private int dropdownContent;    // содержимое дропдауна (пожаловаться и сохранить в закладках);
    private boolean markedAsAds;    // информация о том, содержит ли запись отметку "реклама";
    private int postponedId;        // идентификатор отложенной записи;

    private String geoType;          // тип места;
    private String geoCoordinates;   // координаты места;
    private int geoPlaceDescription; // описание места;

    private int date;               // дата и время размещения поста;
    private String dateFilterUrl;   // ссылка на посты, отфильрованные по дате (при клике на дату поста);

    private String mainTextBlock;   // содержимое блока с текстом;
    private String mainImageUrl;    // изображение в посте;
    private String fullTextButton;  // для кнопки "Показать полностью";

    private int postLikesAmount;    // количество лайков поста;
    private boolean userLikes;      // наличие отметки «Мне нравится» от текущего пользователя;
    private boolean userRepost;     // наличие репоста от текущего пользователя;
    private int repostsAmount;      // количество репостов;
    private int viewsAmount;        // количество просмотров;

    //реплаи и приватность
    private int replyOwnerId;       // идентификатор владельца записи, в ответ на которую была оставлена текущая;
    private int replyPostId;        // идентификатор записи, в ответ на которую была оставлена текущая;
    boolean friendsOnly;            // если запись была создана с опцией «Только для друзей»;
    private String copyright;       // источник материала;

    // URL изображений иконок:
    private String likeButtonImageUrl;   // иконка кнопки "Наравится";
    private String pushedLikeButtonUrl;  // иконка кнопки "Нравится", когда она нажата;
    private String shareButtonIconUrl;   // иконка кнопки "Поделиться";
    private String viewsIconUrl;         // иконка для количества просмотров;

}



