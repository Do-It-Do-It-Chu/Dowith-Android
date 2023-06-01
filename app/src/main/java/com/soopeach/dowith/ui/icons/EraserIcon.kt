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

val EraserIcon: ImageVector
    get() {
        if (_eraserIcon != null) {
            return requireNotNull(_eraserIcon)
        }
        _eraserIcon = Builder(
            name = "Eraser", defaultWidth = 20.0.dp, defaultHeight = 20.0.dp,
            viewportWidth = 20.0f, viewportHeight = 20.0f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF555555)), stroke = null, strokeLineWidth = 0.0f,
                strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                pathFillType = NonZero
            ) {
                moveTo(17.5782f, 6.2813f)
                lineTo(14.3438f, 3.0469f)
                curveTo(13.9922f, 2.6953f, 13.5153f, 2.4977f, 13.018f, 2.4977f)
                curveTo(12.5208f, 2.4977f, 12.0439f, 2.6953f, 11.6922f, 3.0469f)
                lineTo(2.4219f, 12.3172f)
                curveTo(2.0703f, 12.6688f, 1.8728f, 13.1457f, 1.8728f, 13.643f)
                curveTo(1.8728f, 14.1402f, 2.0703f, 14.6171f, 2.4219f, 14.9687f)
                lineTo(4.7704f, 17.3172f)
                curveTo(4.8286f, 17.3754f, 4.8979f, 17.4215f, 4.974f, 17.4529f)
                curveTo(5.0501f, 17.4843f, 5.1318f, 17.5003f, 5.2141f, 17.5f)
                horizontalLineTo(16.8751f)
                curveTo(17.0408f, 17.5f, 17.1998f, 17.4341f, 17.317f, 17.3169f)
                curveTo(17.4342f, 17.1997f, 17.5001f, 17.0408f, 17.5001f, 16.875f)
                curveTo(17.5001f, 16.7092f, 17.4342f, 16.5503f, 17.317f, 16.4331f)
                curveTo(17.1998f, 16.3158f, 17.0408f, 16.25f, 16.8751f, 16.25f)
                horizontalLineTo(10.2579f)
                lineTo(17.5782f, 8.9328f)
                curveTo(17.9298f, 8.5812f, 18.1273f, 8.1043f, 18.1273f, 7.607f)
                curveTo(18.1273f, 7.1098f, 17.9298f, 6.6329f, 17.5782f, 6.2813f)
                close()
                moveTo(16.693f, 8.0469f)
                lineTo(12.5001f, 12.2414f)
                lineTo(8.3836f, 8.125f)
                lineTo(12.5782f, 3.9328f)
                curveTo(12.6362f, 3.8747f, 12.7052f, 3.8286f, 12.781f, 3.7971f)
                curveTo(12.8569f, 3.7657f, 12.9382f, 3.7495f, 13.0204f, 3.7495f)
                curveTo(13.1025f, 3.7495f, 13.1838f, 3.7657f, 13.2597f, 3.7971f)
                curveTo(13.3356f, 3.8286f, 13.4045f, 3.8747f, 13.4626f, 3.9328f)
                lineTo(16.6954f, 7.1656f)
                curveTo(16.8125f, 7.2828f, 16.8783f, 7.4417f, 16.8783f, 7.6074f)
                curveTo(16.8783f, 7.7731f, 16.8125f, 7.932f, 16.6954f, 8.0492f)
                lineTo(16.693f, 8.0469f)
                close()
            }
        }
            .build()
        return requireNotNull(_eraserIcon)
    }

private var _eraserIcon: ImageVector? = null
