package de.zeroclan;

import com.intellij.lexer.FlexAdapter;

import java.io.Reader;

/**
 * Created by Jojo on 18.04.2014.
 */
public class ManiascriptLexerAdapter extends FlexAdapter {
    public ManiascriptLexerAdapter() {
        super(new ManiascriptLexer((Reader) null));
    }
}
