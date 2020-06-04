package it.bitcoinpeople.wallet;

import android.os.Bundle;
import android.text.Html;
import android.text.method.LinkMovementMethod;
import android.widget.TextView;

import it.bitcoinpeople.wallet.ui.GaActivity;
import it.bitcoinpeople.wallet.ui.R;

public class LinksActivity extends GaActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_links);

        TextView t = findViewById(R.id.links_text);
        t.setText(Html.fromHtml("Acquista sul sito <a href=\"https://bitcoinpeople.it\">bitcoinpeople.it</a><br>Metti Mi Piace alla <a href=\"https://www.facebook.com/bitcoinpeople.it/\">Pagina Facebook</a><br>Contattaci a <a href=\"mailto:info@bitcoinpeople.it\">info@bitcoinpeople.it</a>"));
        t.setMovementMethod(LinkMovementMethod.getInstance());
    }

}
