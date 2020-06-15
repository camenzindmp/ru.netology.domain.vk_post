package domain;

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

}