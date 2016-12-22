package nyc.c4q.tarynking.learnjson;

/**
 * Created by tarynking on 10/22/16.
 */

public class JsonPojo {



    private String genre;

    private String[] cast;

    private String description;

    private String name;

    private String year;

    public String getGenre ()
    {
        return genre;
    }

    public void setGenre (String genre)
    {
        this.genre = genre;
    }

    public String[] getCast ()
    {
        return cast;
    }

    public void setCast (String[] cast)
    {
        this.cast = cast;
    }

    public String getDescription ()
    {
        return description;
    }

    public void setDescription (String description)
    {
        this.description = description;
    }

    public String getName ()
    {
        return name;
    }

    public void setName (String name)
    {
        this.name = name;
    }

    public String getYear ()
    {
        return year;
    }

    public void setYear (String year)
    {
        this.year = year;
    }

    @Override
    public String toString()
    {
        return "ClassPojo [genre = "+genre+", cast = "+cast+", description = "+description+", name = "+name+", year = "+year+"]";
    }
}
