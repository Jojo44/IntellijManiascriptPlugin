package de.zeroclan;

import com.intellij.lang.ASTNode;
import com.intellij.lang.Language;
import com.intellij.lang.ParserDefinition;
import com.intellij.lang.PsiParser;
import com.intellij.lexer.FlexAdapter;
import com.intellij.lexer.Lexer;
import com.intellij.openapi.project.Project;
import com.intellij.psi.FileViewProvider;
import com.intellij.psi.PsiElement;
import com.intellij.psi.PsiFile;
import com.intellij.psi.TokenType;
import com.intellij.psi.tree.IFileElementType;
import com.intellij.psi.tree.TokenSet;
import de.zeroclan.parser.ManiascriptParser;
import de.zeroclan.psi.ManiascriptFile;
import de.zeroclan.psi.ManiascriptTypes;
import org.jetbrains.annotations.NotNull;

import java.io.Reader;

/**
 * Created by Jojo on 18.04.2014.
 */
public class ManiascriptParserDefinition implements ParserDefinition
{
    public static final TokenSet WHITE_SPACES = TokenSet.create(TokenType.WHITE_SPACE);
    public static final TokenSet COMMENTS = TokenSet.create(ManiascriptTypes.COMMENT);
    public static final IFileElementType FILE = new IFileElementType(Language.<ManiascriptLanguage>findInstance(ManiascriptLanguage.class));

    @NotNull
    @Override
    public Lexer createLexer(Project project) {
        return new FlexAdapter(new ManiascriptLexer((Reader) null));
    }

    @Override
    public PsiParser createParser(Project project) {
        return new ManiascriptParser();
    }

    @Override
    public IFileElementType getFileNodeType() {
        return FILE;
    }

    @NotNull
    @Override
    public TokenSet getWhitespaceTokens() {
        return WHITE_SPACES;
    }

    @NotNull
    @Override
    public TokenSet getCommentTokens() {
        return COMMENTS;
    }

    @NotNull
    @Override
    public TokenSet getStringLiteralElements() {
        return TokenSet.EMPTY;
    }

    @NotNull
    @Override
    public PsiElement createElement(ASTNode astNode) {
        return ManiascriptTypes.Factory.createElement(astNode);
    }

    @Override
    public PsiFile createFile(FileViewProvider fileViewProvider) {
        return new ManiascriptFile(fileViewProvider);
    }

    @Override
    public SpaceRequirements spaceExistanceTypeBetweenTokens(ASTNode astNode, ASTNode astNode2) {
        return SpaceRequirements.MAY;
    }
}
