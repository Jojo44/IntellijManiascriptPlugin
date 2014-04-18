package de.zeroclan;

import com.intellij.openapi.fileTypes.SyntaxHighlighter;
import com.intellij.openapi.fileTypes.SyntaxHighlighterFactory;
import com.intellij.openapi.project.Project;
import com.intellij.openapi.vfs.VirtualFile;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/**
 * Created by Jojo on 18.04.2014.
 */
public class ManiascriptSyntaxHighlighterFactory extends SyntaxHighlighterFactory
{
    @NotNull
    @Override
    public SyntaxHighlighter getSyntaxHighlighter(@Nullable Project project, @Nullable VirtualFile virtualFile) {
        return new ManiascriptSyntaxHighlighter();
    }
}
