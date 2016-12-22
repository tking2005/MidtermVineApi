package nyc.c4q.tarynking.retrofitchucknorris.model;

import java.util.List;

/**
 * Created by Ramona Harrison
 * on 8/26/16
 *
 * A class representing a message.
 * See https://api.slack.com/docs/message-formatting
 *
 * Example JSON:
 *
 *  {
 *    "text": "I am a test message http://slack.com",
 *    "ts": "1358546515.000008",
 *    "user": "U2147483896",
 *    "attachments": [
 *       {
 *         "text": "And here's an attachment!"
 *       }
 *    ]
 *  }
 *
 */

public class Message {

    private String text;
    private String ts;
    private String user;
    List<Attachment> attachments;



    public String getText() {
        return text;
    }

    public String getTs() {
        return ts;
    }

    public String getUser() {
        return user;
    }

    public List<Attachment> getAttachments() {
        return attachments;
    }
}
