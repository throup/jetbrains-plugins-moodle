package uk.org.throup.jetbrains.moodle;

import com.intellij.psi.codeStyle.CodeStyleSettings;
import com.intellij.psi.codeStyle.CommonCodeStyleSettings;
import com.intellij.psi.codeStyle.PredefinedCodeStyle;
import com.jetbrains.php.lang.PhpFileType;
import com.jetbrains.php.lang.PhpLanguage;
import com.jetbrains.php.lang.formatter.PhpCodeStyleSettings;

public class MoodlePhpPredefinedCodeStyle extends PredefinedCodeStyle {
    public MoodlePhpPredefinedCodeStyle() {
        super("Moodle", PhpLanguage.INSTANCE);
    }

    @Override
    public void apply(CodeStyleSettings codeStyleSettings) {
        defineGeneralSettings(codeStyleSettings);
        defineCommonSettings(codeStyleSettings.getCommonSettings(getLanguage()));
        definePhpSettings(codeStyleSettings.getCustomSettings(PhpCodeStyleSettings.class));
        defineIndentOptions(codeStyleSettings.getIndentOptions(PhpFileType.INSTANCE));
    }

    private void defineGeneralSettings(CodeStyleSettings codeStyleSettings) {
        codeStyleSettings.LINE_SEPARATOR = "\n";
        codeStyleSettings.WRAP_WHEN_TYPING_REACHES_RIGHT_MARGIN = true;
    }

    private void defineCommonSettings(CommonCodeStyleSettings commonSettings) {
        // Explicit settings from the Moodle coding style.
        // https://docs.moodle.org/dev/Coding_style
        commonSettings.RIGHT_MARGIN = 132;

        // Selected.
        commonSettings.LINE_COMMENT_AT_FIRST_COLUMN = false;
        commonSettings.KEEP_LINE_BREAKS = false;
        commonSettings.KEEP_FIRST_COLUMN_COMMENT = false;
        commonSettings.KEEP_CONTROL_STATEMENT_IN_ONE_LINE = false;
        commonSettings.KEEP_BLANK_LINES_BEFORE_RBRACE = 1;
        commonSettings.BLANK_LINES_AFTER_PACKAGE = 1;
        commonSettings.BLANK_LINES_AROUND_CLASS = 2;
        commonSettings.CLASS_BRACE_STYLE = CommonCodeStyleSettings.FORCE_BRACES_IF_MULTILINE;
        commonSettings.METHOD_BRACE_STYLE = CommonCodeStyleSettings.FORCE_BRACES_IF_MULTILINE;
        commonSettings.SPECIAL_ELSE_IF_TREATMENT = true;
        commonSettings.ALIGN_MULTILINE_CHAINED_METHODS = true;
        commonSettings.ALIGN_MULTILINE_PARAMETERS_IN_CALLS = true;
        commonSettings.ALIGN_MULTILINE_BINARY_OPERATION = true;
        commonSettings.ALIGN_MULTILINE_TERNARY_OPERATION = true;
        commonSettings.ALIGN_MULTILINE_EXTENDS_LIST = true;
        commonSettings.ALIGN_MULTILINE_ARRAY_INITIALIZER_EXPRESSION = true;
        commonSettings.ALIGN_GROUP_FIELD_DECLARATIONS = true;
        commonSettings.SPACE_AROUND_BITWISE_OPERATORS = false;
        commonSettings.SPACE_AFTER_TYPE_CAST = true;
        commonSettings.CALL_PARAMETERS_WRAP = CommonCodeStyleSettings.WRAP_AS_NEEDED;
        commonSettings.METHOD_PARAMETERS_WRAP = CommonCodeStyleSettings.WRAP_AS_NEEDED;
        commonSettings.EXTENDS_LIST_WRAP = CommonCodeStyleSettings.WRAP_AS_NEEDED;
        commonSettings.EXTENDS_KEYWORD_WRAP = CommonCodeStyleSettings.WRAP_AS_NEEDED;
        commonSettings.METHOD_CALL_CHAIN_WRAP = CommonCodeStyleSettings.WRAP_AS_NEEDED;
        commonSettings.BINARY_OPERATION_WRAP = CommonCodeStyleSettings.WRAP_AS_NEEDED;
        commonSettings.TERNARY_OPERATION_WRAP = CommonCodeStyleSettings.WRAP_AS_NEEDED;
        commonSettings.TERNARY_OPERATION_SIGNS_ON_NEXT_LINE = true;
        commonSettings.FOR_STATEMENT_WRAP = CommonCodeStyleSettings.WRAP_AS_NEEDED;
        commonSettings.ARRAY_INITIALIZER_WRAP = CommonCodeStyleSettings.WRAP_AS_NEEDED;
        commonSettings.ASSIGNMENT_WRAP = CommonCodeStyleSettings.WRAP_AS_NEEDED;
        commonSettings.IF_BRACE_FORCE = CommonCodeStyleSettings.FORCE_BRACES_ALWAYS;
        commonSettings.DOWHILE_BRACE_FORCE = CommonCodeStyleSettings.FORCE_BRACES_ALWAYS;
        commonSettings.WHILE_BRACE_FORCE = CommonCodeStyleSettings.FORCE_BRACES_ALWAYS;
        commonSettings.FOR_BRACE_FORCE = CommonCodeStyleSettings.FORCE_BRACES_ALWAYS;

        // Unsorted.
        commonSettings.BLOCK_COMMENT_AT_FIRST_COLUMN = true;
        commonSettings.INSERT_FIRST_SPACE_IN_LINE = true;
        commonSettings.KEEP_BLANK_LINES_IN_DECLARATIONS = 2;
        commonSettings.KEEP_BLANK_LINES_IN_CODE = 2;
        commonSettings.BLANK_LINES_BEFORE_PACKAGE = 0;
        commonSettings.BLANK_LINES_BEFORE_IMPORTS = 1;
        commonSettings.BLANK_LINES_AFTER_IMPORTS = 1;
        commonSettings.BLANK_LINES_AROUND_FIELD = 0;
        commonSettings.BLANK_LINES_AROUND_METHOD = 1;
        commonSettings.BLANK_LINES_BEFORE_METHOD_BODY = 0;
        commonSettings.BLANK_LINES_AROUND_FIELD_IN_INTERFACE = 0;
        commonSettings.BLANK_LINES_AROUND_METHOD_IN_INTERFACE = 1;
        commonSettings.BLANK_LINES_AFTER_CLASS_HEADER = 0;
        commonSettings.BLANK_LINES_AFTER_ANONYMOUS_CLASS_HEADER = 0;
        commonSettings.BRACE_STYLE = CommonCodeStyleSettings.FORCE_BRACES_IF_MULTILINE;
        commonSettings.USE_FLYING_GEESE_BRACES = false;
        commonSettings.FLYING_GEESE_BRACES_GAP = CommonCodeStyleSettings.FORCE_BRACES_IF_MULTILINE;
        commonSettings.DO_NOT_INDENT_TOP_LEVEL_CLASS_MEMBERS = false;
        commonSettings.ELSE_ON_NEW_LINE = false;
        commonSettings.WHILE_ON_NEW_LINE = false;
        commonSettings.CATCH_ON_NEW_LINE = false;
        commonSettings.FINALLY_ON_NEW_LINE = false;
        commonSettings.INDENT_CASE_FROM_SWITCH = true;
        commonSettings.ALIGN_MULTILINE_PARAMETERS = true;
        commonSettings.ALIGN_MULTILINE_RESOURCES = true;
        commonSettings.ALIGN_MULTILINE_FOR = true;
        commonSettings.INDENT_WHEN_CASES = true;
        commonSettings.ALIGN_MULTILINE_ASSIGNMENT = false;
        commonSettings.ALIGN_MULTILINE_THROWS_LIST = false;
        commonSettings.ALIGN_THROWS_KEYWORD = false;
        commonSettings.ALIGN_MULTILINE_METHOD_BRACKETS = false;
        commonSettings.ALIGN_MULTILINE_PARENTHESIZED_EXPRESSION = false;
        commonSettings.SPACE_AROUND_ASSIGNMENT_OPERATORS = true;
        commonSettings.SPACE_AROUND_LOGICAL_OPERATORS = true;
        commonSettings.SPACE_AROUND_EQUALITY_OPERATORS = true;
        commonSettings.SPACE_AROUND_RELATIONAL_OPERATORS = true;
        commonSettings.SPACE_AROUND_ADDITIVE_OPERATORS = true;
        commonSettings.SPACE_AROUND_MULTIPLICATIVE_OPERATORS = true;
        commonSettings.SPACE_AROUND_SHIFT_OPERATORS = true;
        commonSettings.SPACE_AROUND_UNARY_OPERATOR = false;
        commonSettings.SPACE_AROUND_LAMBDA_ARROW = true;
        commonSettings.SPACE_AROUND_METHOD_REF_DBL_COLON = false;
        commonSettings.SPACE_AFTER_COMMA = true;
        commonSettings.SPACE_AFTER_COMMA_IN_TYPE_ARGUMENTS = true;
        commonSettings.SPACE_BEFORE_COMMA = false;
        commonSettings.SPACE_AFTER_SEMICOLON = true;
        commonSettings.SPACE_BEFORE_SEMICOLON = false;
        commonSettings.SPACE_WITHIN_PARENTHESES = false;
        commonSettings.SPACE_WITHIN_METHOD_CALL_PARENTHESES = false;
        commonSettings.SPACE_WITHIN_EMPTY_METHOD_CALL_PARENTHESES = false;
        commonSettings.SPACE_WITHIN_METHOD_PARENTHESES = false;
        commonSettings.SPACE_WITHIN_EMPTY_METHOD_PARENTHESES = false;
        commonSettings.SPACE_WITHIN_IF_PARENTHESES = false;
        commonSettings.SPACE_WITHIN_WHILE_PARENTHESES = false;
        commonSettings.SPACE_WITHIN_FOR_PARENTHESES = false;
        commonSettings.SPACE_WITHIN_TRY_PARENTHESES = false;
        commonSettings.SPACE_WITHIN_CATCH_PARENTHESES = false;
        commonSettings.SPACE_WITHIN_SWITCH_PARENTHESES = false;
        commonSettings.SPACE_WITHIN_SYNCHRONIZED_PARENTHESES = false;
        commonSettings.SPACE_WITHIN_CAST_PARENTHESES = false;
        commonSettings.SPACE_WITHIN_BRACKETS = false;
        commonSettings.SPACE_WITHIN_BRACES = false;
        commonSettings.SPACE_WITHIN_ARRAY_INITIALIZER_BRACES = false;
        commonSettings.SPACE_BEFORE_METHOD_CALL_PARENTHESES = false;
        commonSettings.SPACE_BEFORE_METHOD_PARENTHESES = false;
        commonSettings.SPACE_BEFORE_IF_PARENTHESES = true;
        commonSettings.SPACE_BEFORE_WHILE_PARENTHESES = true;
        commonSettings.SPACE_BEFORE_FOR_PARENTHESES = true;
        commonSettings.SPACE_BEFORE_TRY_PARENTHESES = true;
        commonSettings.SPACE_BEFORE_CATCH_PARENTHESES = true;
        commonSettings.SPACE_BEFORE_SWITCH_PARENTHESES = true;
        commonSettings.SPACE_BEFORE_SYNCHRONIZED_PARENTHESES = true;
        commonSettings.SPACE_BEFORE_CLASS_LBRACE = true;
        commonSettings.SPACE_BEFORE_METHOD_LBRACE = true;
        commonSettings.SPACE_BEFORE_IF_LBRACE = true;
        commonSettings.SPACE_BEFORE_ELSE_LBRACE = true;
        commonSettings.SPACE_BEFORE_WHILE_LBRACE = true;
        commonSettings.SPACE_BEFORE_FOR_LBRACE = true;
        commonSettings.SPACE_BEFORE_DO_LBRACE = true;
        commonSettings.SPACE_BEFORE_SWITCH_LBRACE = true;
        commonSettings.SPACE_BEFORE_TRY_LBRACE = true;
        commonSettings.SPACE_BEFORE_CATCH_LBRACE = true;
        commonSettings.SPACE_BEFORE_FINALLY_LBRACE = true;
        commonSettings.SPACE_BEFORE_SYNCHRONIZED_LBRACE = true;
        commonSettings.SPACE_BEFORE_ARRAY_INITIALIZER_LBRACE = false;
        commonSettings.SPACE_BEFORE_ANNOTATION_ARRAY_INITIALIZER_LBRACE = false;
        commonSettings.SPACE_BEFORE_ELSE_KEYWORD = true;
        commonSettings.SPACE_BEFORE_WHILE_KEYWORD = true;
        commonSettings.SPACE_BEFORE_CATCH_KEYWORD = true;
        commonSettings.SPACE_BEFORE_FINALLY_KEYWORD = true;
        commonSettings.SPACE_BEFORE_QUEST = true;
        commonSettings.SPACE_AFTER_QUEST = true;
        commonSettings.SPACE_BEFORE_COLON = true;
        commonSettings.SPACE_AFTER_COLON = true;
        commonSettings.SPACE_BEFORE_TYPE_PARAMETER_LIST = false;
        commonSettings.PREFER_PARAMETERS_WRAP = false;
        commonSettings.CALL_PARAMETERS_LPAREN_ON_NEXT_LINE = false;
        commonSettings.CALL_PARAMETERS_RPAREN_ON_NEXT_LINE = false;
        commonSettings.METHOD_PARAMETERS_LPAREN_ON_NEXT_LINE = false;
        commonSettings.METHOD_PARAMETERS_RPAREN_ON_NEXT_LINE = false;
        commonSettings.RESOURCE_LIST_WRAP = CommonCodeStyleSettings.DO_NOT_WRAP;
        commonSettings.RESOURCE_LIST_LPAREN_ON_NEXT_LINE = false;
        commonSettings.RESOURCE_LIST_RPAREN_ON_NEXT_LINE = false;
        commonSettings.THROWS_LIST_WRAP = CommonCodeStyleSettings.DO_NOT_WRAP;
        commonSettings.THROWS_KEYWORD_WRAP = CommonCodeStyleSettings.DO_NOT_WRAP;
        commonSettings.PARENTHESES_EXPRESSION_LPAREN_WRAP = false;
        commonSettings.PARENTHESES_EXPRESSION_RPAREN_WRAP = false;
        commonSettings.BINARY_OPERATION_SIGN_ON_NEXT_LINE = false;
        commonSettings.MODIFIER_LIST_WRAP = false;
        commonSettings.KEEP_SIMPLE_BLOCKS_IN_ONE_LINE = false;
        commonSettings.KEEP_SIMPLE_METHODS_IN_ONE_LINE = false;
        commonSettings.KEEP_SIMPLE_CLASSES_IN_ONE_LINE = false;
        commonSettings.KEEP_MULTIPLE_EXPRESSIONS_IN_ONE_LINE = false;
        commonSettings.FOR_STATEMENT_LPAREN_ON_NEXT_LINE = false;
        commonSettings.FOR_STATEMENT_RPAREN_ON_NEXT_LINE = false;
        commonSettings.ARRAY_INITIALIZER_LBRACE_ON_NEXT_LINE = false;
        commonSettings.ARRAY_INITIALIZER_RBRACE_ON_NEXT_LINE = false;
        commonSettings.PLACE_ASSIGNMENT_SIGN_ON_NEXT_LINE = false;
        commonSettings.LABELED_STATEMENT_WRAP = CommonCodeStyleSettings.WRAP_ALWAYS;
        commonSettings.WRAP_COMMENTS = false;
        commonSettings.ASSERT_STATEMENT_WRAP = CommonCodeStyleSettings.DO_NOT_WRAP;
        commonSettings.ASSERT_STATEMENT_COLON_ON_NEXT_LINE = false;
        commonSettings.WRAP_LONG_LINES = false;
        commonSettings.METHOD_ANNOTATION_WRAP = CommonCodeStyleSettings.WRAP_ALWAYS;
        commonSettings.CLASS_ANNOTATION_WRAP = CommonCodeStyleSettings.WRAP_ALWAYS;
        commonSettings.FIELD_ANNOTATION_WRAP = CommonCodeStyleSettings.WRAP_ALWAYS;
        commonSettings.PARAMETER_ANNOTATION_WRAP = CommonCodeStyleSettings.DO_NOT_WRAP;
        commonSettings.VARIABLE_ANNOTATION_WRAP = CommonCodeStyleSettings.DO_NOT_WRAP;
        commonSettings.SPACE_BEFORE_ANOTATION_PARAMETER_LIST = false;
        commonSettings.SPACE_WITHIN_ANNOTATION_PARENTHESES = false;
        commonSettings.ENUM_CONSTANTS_WRAP = CommonCodeStyleSettings.DO_NOT_WRAP;
        commonSettings.PARENT_SETTINGS_INSTALLED = false;
        commonSettings.FORCE_REARRANGE_MODE = CommonCodeStyleSettings.REARRANGE_ACCORDIND_TO_DIALOG;
    }

    private void definePhpSettings(PhpCodeStyleSettings phpSettings) {
        // Selected.
        phpSettings.ALIGN_KEY_VALUE_PAIRS = true;
        phpSettings.ALIGN_PHPDOC_PARAM_NAMES = true;
        phpSettings.ALIGN_PHPDOC_COMMENTS = true;
        phpSettings.ALIGN_ASSIGNMENTS = true;
        phpSettings.PHPDOC_BLANK_LINE_BEFORE_TAGS = true;
        phpSettings.PHPDOC_KEEP_BLANK_LINES = false;
        phpSettings.PHPDOC_WRAP_LONG_LINES = true;
        phpSettings.UPPER_CASE_BOOLEAN_CONST = false;
        phpSettings.UPPER_CASE_NULL_CONST = false;
        phpSettings.LOWER_CASE_BOOLEAN_CONST = true;
        phpSettings.LOWER_CASE_NULL_CONST = true;
        phpSettings.KEEP_RPAREN_AND_LBRACE_ON_ONE_LINE = true;
        phpSettings.ALIGN_CLASS_CONSTANTS = true;
        phpSettings.SPACE_BETWEEN_TERNARY_QUEST_AND_COLON = true;
        phpSettings.PHPDOC_TYPE_TAG = PhpCodeStyleSettings.PHPDOC_TYPE_TAG_VAR;

        // Unsorted.
        phpSettings.INDENT_CODE_IN_PHP_TAGS = false;
        phpSettings.CONCAT_SPACES = true;
        phpSettings.PHPDOC_BLANK_LINES_AROUND_PARAMETERS = false;
        phpSettings.BLANK_LINE_BEFORE_RETURN_STATEMENT = false;
        phpSettings.SPACES_AROUND_VAR_WITHIN_BRACKETS = false;
        phpSettings.BLANK_LINES_AROUND_CONSTANTS = 0;
        phpSettings.SPACE_BEFORE_UNARY_NOT = false;
        phpSettings.SPACE_AFTER_UNARY_NOT = false;
        phpSettings.SPACES_WITHIN_SHORT_ECHO_TAGS = true;
        phpSettings.FORCE_SHORT_DECLARATION_ARRAY_STYLE = false;
        phpSettings.PHPDOC_USE_FQCN = false;
        phpSettings.MULTILINE_CHAINED_CALLS_SEMICOLON_ON_NEW_LINE = false;
    }

    private void defineIndentOptions(CommonCodeStyleSettings.IndentOptions indentOptions) {
        // Explicit settings from the Moodle coding style.
        // https://docs.moodle.org/dev/Coding_style
        indentOptions.INDENT_SIZE = 4;
        indentOptions.CONTINUATION_INDENT_SIZE = 8;
        indentOptions.TAB_SIZE = 4;
        indentOptions.USE_TAB_CHARACTER = false;

        // Additional settings compatible with the coding style.
        indentOptions.SMART_TABS = false;
        indentOptions.LABEL_INDENT_SIZE = 0;
        indentOptions.LABEL_INDENT_ABSOLUTE = false;
        indentOptions.USE_RELATIVE_INDENTS = false;
    }
}
