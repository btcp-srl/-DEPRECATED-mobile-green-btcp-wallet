package it.bitcoinpeople.wallet.ui.accounts;

import com.greenaddress.greenapi.data.NetworkData;

public interface NetworkSwitchListener {
    void onNetworkClick(final NetworkData networkData);
}
