package nyc.c4q.tarynking.retrofitchucknorris.model;

/**
 * Created by Ramona Harrison
 * on 8/26/16
 *
 * A class representing a channel topic.
 * See https://api.slack.com/types/channel
 *
 * Example JSON:
 *
 *  {
 *    "value": "Fun times",
 *    "creator": "U024BE7LV",
 *    "last_set": 1369677212
 *  }
 *
 */

public class Topic {

    private String value;
    private String creator;
    private long lastSet;



    public String getValue() {
        return value;
    }

    public String getCreator() {
        return creator;
    }

    public long getLastSet() {
        return lastSet;
    }
}