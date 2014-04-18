package de.zeroclan;

import com.intellij.openapi.fileTypes.FileTypeConsumer;
import com.intellij.openapi.fileTypes.FileTypeFactory;
import org.jetbrains.annotations.NotNull;

/**
 * Created by Jojo on 18.04.2014.
 */
public class ManiascriptFileTypeFactory extends FileTypeFactory
{
    @Override
    public void createFileTypes(@NotNull FileTypeConsumer fileTypeConsumer)
    {
        fileTypeConsumer.consume(ManiascriptFileType.INSTANCE, "ms");
    }
}
