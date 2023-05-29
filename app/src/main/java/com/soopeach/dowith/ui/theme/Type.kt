package com.soopeach.dowith.ui.theme

import androidx.compose.material3.Typography
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.Font
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.sp
import com.soopeach.dowith.R

// Set of Material typography styles to start with
val Typography = Typography(
    bodyLarge = TextStyle(
        fontFamily = PretendardFontFamily.Medium,
        fontWeight = FontWeight.Normal,
        fontSize = 16.sp,
        lineHeight = 24.sp,
        letterSpacing = 0.5.sp
    )
    /* Other default text styles to override
    titleLarge = TextStyle(
        fontFamily = FontFamily.Default,
        fontWeight = FontWeight.Normal,
        fontSize = 22.sp,
        lineHeight = 28.sp,
        letterSpacing = 0.sp
    ),
    labelSmall = TextStyle(
        fontFamily = FontFamily.Default,
        fontWeight = FontWeight.Medium,
        fontSize = 11.sp,
        lineHeight = 16.sp,
        letterSpacing = 0.5.sp
    )
    */
)

object DoWithTypography {
    val Heading1 = TextStyle(
        fontFamily = PretendardFontFamily.ExtraBold,
        fontSize = 32.sp,
        lineHeight = 48.sp
    )

    val Heading2 = TextStyle(
        fontFamily = PretendardFontFamily.Bold,
        fontSize = 28.sp,
        lineHeight = 42.sp
    )

    val Heading3 = TextStyle(
        fontFamily = PretendardFontFamily.Bold,
        fontSize = 24.sp,
        lineHeight = 36.sp
    )

    val Title1 = TextStyle(
        fontFamily = PretendardFontFamily.Bold,
        fontSize = 20.sp,
        lineHeight = 30.sp
    )

    val Title2 = TextStyle(
        fontFamily = PretendardFontFamily.Bold,
        fontSize = 18.sp,
        lineHeight = 27.sp
    )

    val Title3 = TextStyle(
        fontFamily = PretendardFontFamily.Bold,
        fontSize = 16.sp,
        lineHeight = 24.sp
    )

    val Body1 = TextStyle(
        fontFamily = PretendardFontFamily.Medium,
        fontSize = 18.sp,
        lineHeight = 27.sp
    )

    val Body2 = TextStyle(
        fontFamily = PretendardFontFamily.Medium,
        fontSize = 16.sp,
        lineHeight = 24.sp
    )

    val Body3 = TextStyle(
        fontFamily = PretendardFontFamily.Medium,
        fontSize = 14.sp,
        lineHeight = 21.sp
    )

    val Body4 = TextStyle(
        fontFamily = PretendardFontFamily.Medium,
        fontSize = 12.sp,
        lineHeight = 18.sp
    )

    val Caption1 = TextStyle(
        fontFamily = PretendardFontFamily.Regular,
        fontSize = 12.sp,
        lineHeight = 18.sp
    )

}

object PretendardFontFamily {
    val ExtraBold = FontFamily(
        Font(R.font.pretendard_extra_bold, FontWeight.ExtraBold)
    )

    val Bold = FontFamily(
        Font(R.font.pretendard_bold, FontWeight.Bold)
    )

    val Medium = FontFamily(
        Font(R.font.pretendard_medium, FontWeight.Medium)
    )

    val Regular = FontFamily(
        Font(R.font.pretendard_regular, FontWeight.Normal)
    )
}
