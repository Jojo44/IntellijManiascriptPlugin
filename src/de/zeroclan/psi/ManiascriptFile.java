package de.zeroclan.psi;

import com.intellij.extapi.psi.PsiFileBase;
import com.intellij.lang.Language;
import com.intellij.openapi.fileTypes.FileType;
import com.intellij.psi.FileViewProvider;
import de.zeroclan.ManiascriptFileType;
import de.zeroclan.ManiascriptLanguage;
import org.jetbrains.annotations.NotNull;

import javax.swing.*;

/**
 * Created by Jojo on 18.04.2014.
 */
public class ManiascriptFile extends PsiFileBase
{
    public ManiascriptFile(@NotNull FileViewProvider viewProvider)
    {
        super(viewProvider, ManiascriptLanguage.INSTANCE);
    }

    @NotNull
    @Override
    public FileType getFileType()
    {
        return ManiascriptFileType.INSTANCE;
    }

    @Override
    public String toString()
    {
        return "Maniascript File";
    }

    @Override
    public Icon getIcon(int flags)
    {
        return super.getIcon(flags);
    }
}

