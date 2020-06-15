public class UserCapabilities {

    // Действия с постом:
    private boolean canPin;
    private boolean canDelete;
    private boolean canEdit;
    private boolean canLike;        // информация о том, может ли текущий пользователь поставить отметку «Мне нравится»;
    private boolean canShare;       // информация о том, может ли текущий пользователь сделать репост записи;

    // Действия с комментариями:
    private int commentsAmount;     // количество комментариев;
    private boolean canPost;        // информация о том, может ли текущий пользователь комментировать запись;
    private boolean groupsCanPost;  // информация о том, могут ли сообщества комментировать запись;
    private boolean canClose;       // может ли текущий пользователь закрыть комментарии к записи;
    private boolean canOpen;        // может ли текущий пользователь открыть комментарии к записи.




}
