package ru.netology.domain;

public class UserCapabilities {

    // Действия с постом:
    private boolean canPin;         // может ли юзер закреить пост;
    private boolean canDelete;      // может ли юзер удалить пост;
    private boolean canEdit;        // может ли юзер редактировать пост;
    private boolean canLike;        // информация о том, может ли текущий пользователь поставить отметку «Мне нравится»;
    private boolean canShare;       // информация о том, может ли текущий пользователь сделать репост записи;

    // Действия с комментариями:
    private int commentsAmount;     // количество комментариев;
    private boolean canPost;        // информация о том, может ли текущий пользователь комментировать запись;
    private boolean groupsCanPost;  // информация о том, могут ли сообщества комментировать запись;
    private boolean canClose;       // может ли текущий пользователь закрыть комментарии к записи;
    private boolean canOpen;        // может ли текущий пользователь открыть комментарии к записи.

    public boolean isCanPin() {
        return canPin;
    }

    public void setCanPin(boolean canPin) {
        this.canPin = canPin;
    }

    public boolean isCanDelete() {
        return canDelete;
    }

    public void setCanDelete(boolean canDelete) {
        this.canDelete = canDelete;
    }

    public boolean isCanEdit() {
        return canEdit;
    }

    public void setCanEdit(boolean canEdit) {
        this.canEdit = canEdit;
    }

    public boolean isCanLike() {
        return canLike;
    }

    public void setCanLike(boolean canLike) {
        this.canLike = canLike;
    }

    public boolean isCanShare() {
        return canShare;
    }

    public void setCanShare(boolean canShare) {
        this.canShare = canShare;
    }

    public int getCommentsAmount() {
        return commentsAmount;
    }

    public void setCommentsAmount(int commentsAmount) {
        this.commentsAmount = commentsAmount;
    }

    public boolean isCanPost() {
        return canPost;
    }

    public void setCanPost(boolean canPost) {
        this.canPost = canPost;
    }

    public boolean isGroupsCanPost() {
        return groupsCanPost;
    }

    public void setGroupsCanPost(boolean groupsCanPost) {
        this.groupsCanPost = groupsCanPost;
    }

    public boolean isCanClose() {
        return canClose;
    }

    public void setCanClose(boolean canClose) {
        this.canClose = canClose;
    }

    public boolean isCanOpen() {
        return canOpen;
    }

    public void setCanOpen(boolean canOpen) {
        this.canOpen = canOpen;
    }
}
