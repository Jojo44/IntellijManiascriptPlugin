package de.zeroclan;

import com.intellij.openapi.fileTypes.LanguageFileType;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

import javax.swing.*;

/**
 * Created by Jojo on 18.04.2014.
 */
public class ManiascriptFileType extends LanguageFileType
{
    public static final ManiascriptFileType INSTANCE = new ManiascriptFileType();

    private ManiascriptFileType()
    {
        super(ManiascriptLanguage.INSTANCE);
    }

    @NotNull
    @Override
    public String getName()
    {
        return "Maniascript File";
    }

    @NotNull
    @Override
    public String getDescription()
    {
        return "Maniascript Language File";
    }

    @NotNull
    @Override
    public String getDefaultExtension()
    {
        return "ms";
    }

    @Nullable
    @Override
    public Icon getIcon()
    {
        return ManiascriptIcons.FILE;
    }
}
