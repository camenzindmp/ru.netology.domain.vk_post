package ru.netology.domain;

public class CommentsInfo {
    // Комментатор:
    private String getCommentatorImageUrl; // изображение юзера, оставившего комментарий;
    private int commentatorId;             // айди юзера, оставившего комментарий;
    private String commentatorLink;        // ссылка на юзера, оставившего комментарий;

    // Конкретный комментарий:
    private int commentId;                 // айди комментария;
    private String commentText;            // текст комментария;
    private String commentDate;            // дата размещения комментария;
    private String commentTime;            // время размещения комментария;
    private String inputFieldText;         // введенный юзером текст в поле для ввода комментария;
    private int commentatorLikesAmount;    // количество лайков комментария;
    private String reportIconUrl;          // иконка для кнопки "Пожаловаться";
    private String responseButton;         // для кнопки "Ответить";

    //URL изображений иконок:
    private String commentButtonIconUrl; // иконка конопки "Комментарий";
    private String addItemIconUrl;       // иконка кнопки добавления материалов в комментарий;
    private String addPhotoIconUrl;      // иконка кнопки "Фотография";
    private String addEmojiIconUrl;      // иконка для кнопки выбора эмоджи;
    private String sendButtonIconUrl;    // иконка для кнопи размещения комментария;

    public String getGetCommentatorImageUrl() {
        return getCommentatorImageUrl;
    }

    public void setGetCommentatorImageUrl(String getCommentatorImageUrl) {
        this.getCommentatorImageUrl = getCommentatorImageUrl;
    }

    public int getCommentatorId() {
        return commentatorId;
    }

    public void setCommentatorId(int commentatorId) {
        this.commentatorId = commentatorId;
    }

    public String getCommentatorLink() {
        return commentatorLink;
    }

    public void setCommentatorLink(String commentatorLink) {
        this.commentatorLink = commentatorLink;
    }

    public int getCommentId() {
        return commentId;
    }

    public void setCommentId(int commentId) {
        this.commentId = commentId;
    }

    public String getCommentText() {
        return commentText;
    }

    public void setCommentText(String commentText) {
        this.commentText = commentText;
    }

    public String getCommentDate() {
        return commentDate;
    }

    public void setCommentDate(String commentDate) {
        this.commentDate = commentDate;
    }

    public String getCommentTime() {
        return commentTime;
    }

    public void setCommentTime(String commentTime) {
        this.commentTime = commentTime;
    }

    public String getInputFieldText() {
        return inputFieldText;
    }

    public void setInputFieldText(String inputFieldText) {
        this.inputFieldText = inputFieldText;
    }

    public int getCommentatorLikesAmount() {
        return commentatorLikesAmount;
    }

    public void setCommentatorLikesAmount(int commentatorLikesAmount) {
        this.commentatorLikesAmount = commentatorLikesAmount;
    }

    public String getReportIconUrl() {
        return reportIconUrl;
    }

    public void setReportIconUrl(String reportIconUrl) {
        this.reportIconUrl = reportIconUrl;
    }

    public String getResponseButton() {
        return responseButton;
    }

    public void setResponseButton(String responseButton) {
        this.responseButton = responseButton;
    }

    public String getCommentButtonIconUrl() {
        return commentButtonIconUrl;
    }

    public void setCommentButtonIconUrl(String commentButtonIconUrl) {
        this.commentButtonIconUrl = commentButtonIconUrl;
    }

    public String getAddItemIconUrl() {
        return addItemIconUrl;
    }

    public void setAddItemIconUrl(String addItemIconUrl) {
        this.addItemIconUrl = addItemIconUrl;
    }

    public String getAddPhotoIconUrl() {
        return addPhotoIconUrl;
    }

    public void setAddPhotoIconUrl(String addPhotoIconUrl) {
        this.addPhotoIconUrl = addPhotoIconUrl;
    }

    public String getAddEmojiIconUrl() {
        return addEmojiIconUrl;
    }

    public void setAddEmojiIconUrl(String addEmojiIconUrl) {
        this.addEmojiIconUrl = addEmojiIconUrl;
    }

    public String getSendButtonIconUrl() {
        return sendButtonIconUrl;
    }

    public void setSendButtonIconUrl(String sendButtonIconUrl) {
        this.sendButtonIconUrl = sendButtonIconUrl;
    }
}