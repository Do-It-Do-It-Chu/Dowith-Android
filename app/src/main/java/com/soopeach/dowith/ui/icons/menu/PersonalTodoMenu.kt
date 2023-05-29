package com.soopeach.dowith.ui.icons.menu

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val PersonalTodoMenu: ImageVector
    get() {
        if (_personalTodoMenu != null) {
            return requireNotNull(_personalTodoMenu)
        }
        _personalTodoMenu = Builder(name = "PersonalTodoMenu", defaultWidth = 26.0.dp, defaultHeight
                = 26.0.dp, viewportWidth = 26.0f, viewportHeight = 26.0f).apply {
            path(fill = SolidColor(Color(0xFFB7B7B7)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(21.125f, 3.25f)
                horizontalLineTo(4.875f)
                curveTo(4.444f, 3.25f, 4.0307f, 3.4212f, 3.726f, 3.726f)
                curveTo(3.4212f, 4.0307f, 3.25f, 4.444f, 3.25f, 4.875f)
                verticalLineTo(21.125f)
                curveTo(3.25f, 21.556f, 3.4212f, 21.9693f, 3.726f, 22.274f)
                curveTo(4.0307f, 22.5788f, 4.444f, 22.75f, 4.875f, 22.75f)
                horizontalLineTo(21.125f)
                curveTo(21.556f, 22.75f, 21.9693f, 22.5788f, 22.274f, 22.274f)
                curveTo(22.5788f, 21.9693f, 22.75f, 21.556f, 22.75f, 21.125f)
                verticalLineTo(4.875f)
                curveTo(22.75f, 4.444f, 22.5788f, 4.0307f, 22.274f, 3.726f)
                curveTo(21.9693f, 3.4212f, 21.556f, 3.25f, 21.125f, 3.25f)
                close()
                moveTo(17.6373f, 11.1373f)
                lineTo(11.9498f, 16.8248f)
                curveTo(11.8744f, 16.9004f, 11.7848f, 16.9603f, 11.6861f, 17.0012f)
                curveTo(11.5875f, 17.0421f, 11.4818f, 17.0631f, 11.375f, 17.0631f)
                curveTo(11.2682f, 17.0631f, 11.1625f, 17.0421f, 11.0639f, 17.0012f)
                curveTo(10.9652f, 16.9603f, 10.8756f, 16.9004f, 10.8002f, 16.8248f)
                lineTo(8.3627f, 14.3873f)
                curveTo(8.2102f, 14.2349f, 8.1245f, 14.0281f, 8.1245f, 13.8125f)
                curveTo(8.1245f, 13.5969f, 8.2102f, 13.3901f, 8.3627f, 13.2377f)
                curveTo(8.5151f, 13.0852f, 8.7219f, 12.9995f, 8.9375f, 12.9995f)
                curveTo(9.1531f, 12.9995f, 9.3599f, 13.0852f, 9.5123f, 13.2377f)
                lineTo(11.375f, 15.1013f)
                lineTo(16.4877f, 9.9877f)
                curveTo(16.5631f, 9.9122f, 16.6528f, 9.8523f, 16.7514f, 9.8114f)
                curveTo(16.85f, 9.7706f, 16.9557f, 9.7495f, 17.0625f, 9.7495f)
                curveTo(17.1693f, 9.7495f, 17.275f, 9.7706f, 17.3736f, 9.8114f)
                curveTo(17.4722f, 9.8523f, 17.5619f, 9.9122f, 17.6373f, 9.9877f)
                curveTo(17.7128f, 10.0631f, 17.7727f, 10.1528f, 17.8136f, 10.2514f)
                curveTo(17.8544f, 10.35f, 17.8755f, 10.4557f, 17.8755f, 10.5625f)
                curveTo(17.8755f, 10.6693f, 17.8544f, 10.775f, 17.8136f, 10.8736f)
                curveTo(17.7727f, 10.9722f, 17.7128f, 11.0619f, 17.6373f, 11.1373f)
                close()
            }
        }
        .build()
        return requireNotNull(_personalTodoMenu)
    }

private var _personalTodoMenu: ImageVector? = null
