package com.greenaddress.gdk;

import com.google.common.util.concurrent.SettableFuture;
import com.greenaddress.greenapi.data.HWDeviceRequiredData;
import it.bitcoinpeople.wallet.ui.GaActivity;

public interface CodeResolver {
    SettableFuture<String> hardwareRequest(final HWDeviceRequiredData requiredData);
    SettableFuture<String> code(final String method);
}
