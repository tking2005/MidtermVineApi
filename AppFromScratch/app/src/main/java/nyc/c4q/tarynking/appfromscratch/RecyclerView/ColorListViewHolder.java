package nyc.c4q.tarynking.appfromscratch.RecyclerView;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.TextView;

import nyc.c4q.tarynking.appfromscratch.R;

/**
 * Created by tarynking on 11/14/16.
 */

public class ColorListViewHolder extends RecyclerView.ViewHolder {

    Context context;
    private TextView colorName;

    public ColorListViewHolder(View itemView) {
        super(itemView);
        colorName = (TextView) itemView.findViewById(R.id.color_item);

    }

    public void bind(ColorPalette colorName) {
        colorName.setText(colorName.getColorItem());
    }
}



/*
public class MyViewHolder extends RecyclerView.ViewHolder {

    private final View view;
    public TextView spanishWord;


    public MyViewHolder(ViewGroup parent) {
        super(inflateView(parent));
        view = itemView;
        spanishWord = (TextView) view.findViewById(R.id.spanish_word);
    }

    private static View inflateView(ViewGroup parent) {
        LayoutInflater inflater = LayoutInflater.from(parent.getContext());
        return inflater.inflate(R.layout.word_layout, parent, false);
    }

    public void bind(SpanishWord word) {
        spanishWord.setText(word.getSpanishWord());
    }

    public TextView getSpanishWord() {
        return spanishWord;
    }

}
 */