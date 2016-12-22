package nyc.c4q.tarynking.retrofitchucknorris.model;

/**
 * Created by tarynking on 10/23/16.
 *
 * {
     "icon_url" : "https://assets.chucknorris.host/img/avatar/chuck-norris.png",
     "id" : "3WPtXegnSseGH8AHKtzzoA",
     "url" : "http://api.chucknorris.io/jokes/3WPtXegnSseGH8AHKtzzoA"
     "value" : "Chuck Norris invented the female orgasm."
 }
 */

public class ChuckNorrisJoke {

    private String iconURL;

    private String id;

    private String url;

    private String value;

    public String getIconURL() {
        return iconURL;
    }

    public void setIconURL(String iconURL) {
        this.iconURL = iconURL;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public String getValue() {
        return value;
    }

    public void setValue(String value) {
        this.value = value;
    }
}
