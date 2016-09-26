package me.smartproxy.tunnel.shadowsocks.bcencryptor;

import org.bouncycastle.crypto.StreamCipher;
import org.bouncycastle.crypto.engines.RC4Engine;

/**
 * Created by hy on 9/26/16.
 */

public class Rc4Encryptor extends BaseBouncyEncryptor {

    @Override
    protected StreamCipher createCipher(){
        return new RC4Engine();
    }
}

