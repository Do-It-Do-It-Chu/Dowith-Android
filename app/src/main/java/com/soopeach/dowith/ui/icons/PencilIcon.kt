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

val PencilIcon: ImageVector
    get() {
        if (_pencilIcon != null) {
            return requireNotNull(_pencilIcon)
        }
        _pencilIcon = Builder(name = "PencilIcon", defaultWidth = 20.0.dp, defaultHeight = 20.0.dp,
                viewportWidth = 20.0f, viewportHeight = 20.0f).apply {
            path(fill = SolidColor(Color(0xFF949494)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(17.7594f, 5.7321f)
                lineTo(14.268f, 2.2415f)
                curveTo(14.1519f, 2.1254f, 14.0141f, 2.0333f, 13.8624f, 1.9704f)
                curveTo(13.7107f, 1.9076f, 13.5482f, 1.8752f, 13.384f, 1.8752f)
                curveTo(13.2198f, 1.8752f, 13.0572f, 1.9076f, 12.9056f, 1.9704f)
                curveTo(12.7539f, 2.0333f, 12.6161f, 2.1254f, 12.5f, 2.2415f)
                lineTo(2.8664f, 11.8751f)
                curveTo(2.7498f, 11.9907f, 2.6574f, 12.1284f, 2.5945f, 12.2801f)
                curveTo(2.5316f, 12.4318f, 2.4995f, 12.5944f, 2.5f, 12.7586f)
                verticalLineTo(16.2501f)
                curveTo(2.5f, 16.5816f, 2.6317f, 16.8995f, 2.8661f, 17.1339f)
                curveTo(3.1005f, 17.3684f, 3.4185f, 17.5001f, 3.75f, 17.5001f)
                horizontalLineTo(16.875f)
                curveTo(17.0408f, 17.5001f, 17.1997f, 17.4342f, 17.3169f, 17.317f)
                curveTo(17.4342f, 17.1998f, 17.5f, 17.0408f, 17.5f, 16.8751f)
                curveTo(17.5f, 16.7093f, 17.4342f, 16.5503f, 17.3169f, 16.4331f)
                curveTo(17.1997f, 16.3159f, 17.0408f, 16.2501f, 16.875f, 16.2501f)
                horizontalLineTo(9.0094f)
                lineTo(17.7594f, 7.5001f)
                curveTo(17.8755f, 7.384f, 17.9676f, 7.2462f, 18.0304f, 7.0945f)
                curveTo(18.0933f, 6.9428f, 18.1256f, 6.7803f, 18.1256f, 6.6161f)
                curveTo(18.1256f, 6.4519f, 18.0933f, 6.2893f, 18.0304f, 6.1377f)
                curveTo(17.9676f, 5.986f, 17.8755f, 5.8482f, 17.7594f, 5.7321f)
                close()
                moveTo(10.625f, 5.8836f)
                lineTo(11.9289f, 7.1876f)
                lineTo(5.3125f, 13.804f)
                lineTo(4.0086f, 12.5001f)
                lineTo(10.625f, 5.8836f)
                close()
                moveTo(3.75f, 16.2501f)
                verticalLineTo(14.0086f)
                lineTo(5.9914f, 16.2501f)
                horizontalLineTo(3.75f)
                close()
                moveTo(7.5f, 15.9915f)
                lineTo(6.1969f, 14.6876f)
                lineTo(12.8125f, 8.0711f)
                lineTo(14.1164f, 9.3751f)
                lineTo(7.5f, 15.9915f)
                close()
                moveTo(15.0f, 8.4915f)
                lineTo(11.5094f, 5.0001f)
                lineTo(13.3844f, 3.1251f)
                lineTo(16.875f, 6.6165f)
                lineTo(15.0f, 8.4915f)
                close()
            }
        }
        .build()
        return requireNotNull(_pencilIcon)
    }

private var _pencilIcon: ImageVector? = null
