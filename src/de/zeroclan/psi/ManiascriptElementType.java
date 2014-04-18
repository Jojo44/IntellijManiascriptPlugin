package de.zeroclan.psi;

import com.intellij.lang.Language;
import com.intellij.psi.tree.IElementType;
import de.zeroclan.ManiascriptLanguage;
import org.jetbrains.annotations.NonNls;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/**
 * Created by Jojo on 18.04.2014.
 */
public class ManiascriptElementType extends IElementType
{
    protected ManiascriptElementType(@NotNull @NonNls String debugName)
    {
        super(debugName, ManiascriptLanguage.INSTANCE);
    }
}
