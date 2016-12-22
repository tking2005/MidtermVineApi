package nyc.c4q.tarynking.retrofitchucknorris.network;

/**
 * Created by tarynking on 10/23/16.
 */


import nyc.c4q.tarynking.retrofitchucknorris.model.Message;

/**
 * Created by Ramona Harrison
 * on 8/26/16
 *
 * A class representing the response from chat.postMessage
 * See https://api.slack.com/methods/chat.postMessage
 *
 */

public class SendMessageResponse {

    private String channel;
    private String ts;
    private Message message;

    public String getChannel() {
        return channel;
    }

    public String getTs() {
        return ts;
    }

    public Message getMessage() {
        return message;
    }
}