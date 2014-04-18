package de.zeroclan;

import com.intellij.lang.Language;

/**
 * Created by Jojo on 18.04.2014.
 */
public class ManiascriptLanguage extends Language
{
    public static final ManiascriptLanguage INSTANCE = new ManiascriptLanguage();

    protected ManiascriptLanguage()
    {
        super("Maniascript");
    }
}
