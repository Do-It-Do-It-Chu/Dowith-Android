package com.soopeach.dowith.ui.icons

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val CheckBoxIcon: ImageVector
    get() {
        if (_checkBoxIcon != null) {
            return requireNotNull(_checkBoxIcon)
        }
        _checkBoxIcon = Builder(name = "CheckBoxIcon", defaultWidth = 20.0.dp, defaultHeight =
                20.0.dp, viewportWidth = 20.0f, viewportHeight = 20.0f).apply {
            path(fill = SolidColor(Color(0xFFFF7F00)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(13.5672f, 7.6828f)
                curveTo(13.6253f, 7.7409f, 13.6714f, 7.8098f, 13.7029f, 7.8857f)
                curveTo(13.7343f, 7.9615f, 13.7505f, 8.0429f, 13.7505f, 8.125f)
                curveTo(13.7505f, 8.2071f, 13.7343f, 8.2885f, 13.7029f, 8.3643f)
                curveTo(13.6714f, 8.4402f, 13.6253f, 8.5091f, 13.5672f, 8.5672f)
                lineTo(9.1922f, 12.9422f)
                curveTo(9.1341f, 13.0003f, 9.0652f, 13.0464f, 8.9893f, 13.0779f)
                curveTo(8.9135f, 13.1093f, 8.8321f, 13.1255f, 8.75f, 13.1255f)
                curveTo(8.6679f, 13.1255f, 8.5865f, 13.1093f, 8.5107f, 13.0779f)
                curveTo(8.4348f, 13.0464f, 8.3659f, 13.0003f, 8.3078f, 12.9422f)
                lineTo(6.4328f, 11.0672f)
                curveTo(6.3155f, 10.9499f, 6.2497f, 10.7909f, 6.2497f, 10.625f)
                curveTo(6.2497f, 10.4591f, 6.3155f, 10.3001f, 6.4328f, 10.1828f)
                curveTo(6.5501f, 10.0655f, 6.7091f, 9.9997f, 6.875f, 9.9997f)
                curveTo(7.0409f, 9.9997f, 7.1999f, 10.0655f, 7.3172f, 10.1828f)
                lineTo(8.75f, 11.6164f)
                lineTo(12.6828f, 7.6828f)
                curveTo(12.7409f, 7.6247f, 12.8098f, 7.5786f, 12.8857f, 7.5472f)
                curveTo(12.9615f, 7.5157f, 13.0429f, 7.4995f, 13.125f, 7.4995f)
                curveTo(13.2071f, 7.4995f, 13.2885f, 7.5157f, 13.3643f, 7.5472f)
                curveTo(13.4402f, 7.5786f, 13.5091f, 7.6247f, 13.5672f, 7.6828f)
                close()
                moveTo(17.5f, 3.75f)
                verticalLineTo(16.25f)
                curveTo(17.5f, 16.5815f, 17.3683f, 16.8995f, 17.1339f, 17.1339f)
                curveTo(16.8995f, 17.3683f, 16.5815f, 17.5f, 16.25f, 17.5f)
                horizontalLineTo(3.75f)
                curveTo(3.4185f, 17.5f, 3.1005f, 17.3683f, 2.8661f, 17.1339f)
                curveTo(2.6317f, 16.8995f, 2.5f, 16.5815f, 2.5f, 16.25f)
                verticalLineTo(3.75f)
                curveTo(2.5f, 3.4185f, 2.6317f, 3.1005f, 2.8661f, 2.8661f)
                curveTo(3.1005f, 2.6317f, 3.4185f, 2.5f, 3.75f, 2.5f)
                horizontalLineTo(16.25f)
                curveTo(16.5815f, 2.5f, 16.8995f, 2.6317f, 17.1339f, 2.8661f)
                curveTo(17.3683f, 3.1005f, 17.5f, 3.4185f, 17.5f, 3.75f)
                close()
                moveTo(16.25f, 16.25f)
                verticalLineTo(3.75f)
                horizontalLineTo(3.75f)
                verticalLineTo(16.25f)
                horizontalLineTo(16.25f)
                close()
            }
        }
        .build()
        return requireNotNull(_checkBoxIcon)
    }

private var _checkBoxIcon: ImageVector? = null
