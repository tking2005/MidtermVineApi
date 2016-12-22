package nyc.c4q.tarynking.retrofitchucknorris.model;

import java.util.List;

/**
 * Created by Ramona Harrison
 * on 8/26/16
 *
 * A class representing a message attachment.
 * See https://api.slack.com/docs/message-attachments
 *
 */

public class Attachment {


    private String fallback;
    private String color;
    private String pretext;
    private String authorName;
    private String authorLink;
    private String authorIcon;
    private String title;
    private String titleLink;
    private String text;
    private List<Field> fields;
    private String imageUrl;
    private String thumbUrl;
    private String footer;
    private String footerIcon;
    private long ts;

    public String getFallback() {
        return fallback;
    }

    public String getColor() {
        return color;
    }

    public String getPretext() {
        return pretext;
    }

    public String getAuthorName() {
        return authorName;
    }

    public String getAuthorLink() {
        return authorLink;
    }

    public String getAuthorIcon() {
        return authorIcon;
    }

    public String getTitle() {
        return title;
    }

    public String getTitleLink() {
        return titleLink;
    }

    public String getText() {
        return text;
    }

    public List<Field> getFields() {
        return fields;
    }

    public String getImageUrl() {
        return imageUrl;
    }

    public String getThumbUrl() {
        return thumbUrl;
    }

    public String getFooter() {
        return footer;
    }

    public String getFooterIcon() {
        return footerIcon;
    }

    public long getTs() {
        return ts;
    }
}
