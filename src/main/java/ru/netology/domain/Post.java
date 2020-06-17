package ru.netology.domain;

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

    public int getGroupId() {
        return groupId;
    }

    public void setGroupId(int groupId) {
        this.groupId = groupId;
    }

    public int getCreatorId() {
        return creatorId;
    }

    public void setCreatorId(int creatorId) {
        this.creatorId = creatorId;
    }

    public int getSignerId() {
        return signerId;
    }

    public void setSignerId(int signerId) {
        this.signerId = signerId;
    }

    public int getAdminId() {
        return adminId;
    }

    public void setAdminId(int adminId) {
        this.adminId = adminId;
    }

    public String getCreatorImageUrl() {
        return creatorImageUrl;
    }

    public void setCreatorImageUrl(String creatorImageUrl) {
        this.creatorImageUrl = creatorImageUrl;
    }

    public String getGroupName() {
        return groupName;
    }

    public void setGroupName(String groupName) {
        this.groupName = groupName;
    }

    public String getCreatorLink() {
        return creatorLink;
    }

    public void setCreatorLink(String creatorLink) {
        this.creatorLink = creatorLink;
    }

    public int getPostId() {
        return postId;
    }

    public void setPostId(int postId) {
        this.postId = postId;
    }

    public boolean isAnchoredPost() {
        return AnchoredPost;
    }

    public void setAnchoredPost(boolean anchoredPost) {
        AnchoredPost = anchoredPost;
    }

    public boolean isPostSource() {
        return postSource;
    }

    public void setPostSource(boolean postSource) {
        this.postSource = postSource;
    }

    public int getDropdownContent() {
        return dropdownContent;
    }

    public void setDropdownContent(int dropdownContent) {
        this.dropdownContent = dropdownContent;
    }

    public boolean isMarkedAsAds() {
        return markedAsAds;
    }

    public void setMarkedAsAds(boolean markedAsAds) {
        this.markedAsAds = markedAsAds;
    }

    public int getPostponedId() {
        return postponedId;
    }

    public void setPostponedId(int postponedId) {
        this.postponedId = postponedId;
    }

    public String getGeoType() {
        return geoType;
    }

    public void setGeoType(String geoType) {
        this.geoType = geoType;
    }

    public String getGeoCoordinates() {
        return geoCoordinates;
    }

    public void setGeoCoordinates(String geoCoordinates) {
        this.geoCoordinates = geoCoordinates;
    }

    public int getGeoPlaceDescription() {
        return geoPlaceDescription;
    }

    public void setGeoPlaceDescription(int geoPlaceDescription) {
        this.geoPlaceDescription = geoPlaceDescription;
    }

    public int getDate() {
        return date;
    }

    public void setDate(int date) {
        this.date = date;
    }

    public String getDateFilterUrl() {
        return dateFilterUrl;
    }

    public void setDateFilterUrl(String dateFilterUrl) {
        this.dateFilterUrl = dateFilterUrl;
    }

    public String getMainTextBlock() {
        return mainTextBlock;
    }

    public void setMainTextBlock(String mainTextBlock) {
        this.mainTextBlock = mainTextBlock;
    }

    public String getMainImageUrl() {
        return mainImageUrl;
    }

    public void setMainImageUrl(String mainImageUrl) {
        this.mainImageUrl = mainImageUrl;
    }

    public String getFullTextButton() {
        return fullTextButton;
    }

    public void setFullTextButton(String fullTextButton) {
        this.fullTextButton = fullTextButton;
    }

    public int getPostLikesAmount() {
        return postLikesAmount;
    }

    public void setPostLikesAmount(int postLikesAmount) {
        this.postLikesAmount = postLikesAmount;
    }

    public boolean isUserLikes() {
        return userLikes;
    }

    public void setUserLikes(boolean userLikes) {
        this.userLikes = userLikes;
    }

    public boolean isUserRepost() {
        return userRepost;
    }

    public void setUserRepost(boolean userRepost) {
        this.userRepost = userRepost;
    }

    public int getRepostsAmount() {
        return repostsAmount;
    }

    public void setRepostsAmount(int repostsAmount) {
        this.repostsAmount = repostsAmount;
    }

    public int getViewsAmount() {
        return viewsAmount;
    }

    public void setViewsAmount(int viewsAmount) {
        this.viewsAmount = viewsAmount;
    }

    public int getReplyOwnerId() {
        return replyOwnerId;
    }

    public void setReplyOwnerId(int replyOwnerId) {
        this.replyOwnerId = replyOwnerId;
    }

    public int getReplyPostId() {
        return replyPostId;
    }

    public void setReplyPostId(int replyPostId) {
        this.replyPostId = replyPostId;
    }

    public boolean isFriendsOnly() {
        return friendsOnly;
    }

    public void setFriendsOnly(boolean friendsOnly) {
        this.friendsOnly = friendsOnly;
    }

    public String getCopyright() {
        return copyright;
    }

    public void setCopyright(String copyright) {
        this.copyright = copyright;
    }

    public String getLikeButtonImageUrl() {
        return likeButtonImageUrl;
    }

    public void setLikeButtonImageUrl(String likeButtonImageUrl) {
        this.likeButtonImageUrl = likeButtonImageUrl;
    }

    public String getPushedLikeButtonUrl() {
        return pushedLikeButtonUrl;
    }

    public void setPushedLikeButtonUrl(String pushedLikeButtonUrl) {
        this.pushedLikeButtonUrl = pushedLikeButtonUrl;
    }

    public String getShareButtonIconUrl() {
        return shareButtonIconUrl;
    }

    public void setShareButtonIconUrl(String shareButtonIconUrl) {
        this.shareButtonIconUrl = shareButtonIconUrl;
    }

    public String getViewsIconUrl() {
        return viewsIconUrl;
    }

    public void setViewsIconUrl(String viewsIconUrl) {
        this.viewsIconUrl = viewsIconUrl;
    }
}



