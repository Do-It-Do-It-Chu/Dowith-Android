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

val CalendarIcon: ImageVector
    get() {
        if (_calendarIcon != null) {
            return requireNotNull(_calendarIcon)
        }
        _calendarIcon = Builder(name = "CalendarIcon", defaultWidth = 20.0.dp, defaultHeight =
                20.0.dp, viewportWidth = 20.0f, viewportHeight = 20.0f).apply {
            path(fill = SolidColor(Color(0xFFFFB266)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(16.875f, 3.75f)
                verticalLineTo(6.875f)
                horizontalLineTo(3.125f)
                verticalLineTo(3.75f)
                curveTo(3.125f, 3.5842f, 3.1909f, 3.4253f, 3.3081f, 3.3081f)
                curveTo(3.4253f, 3.1909f, 3.5842f, 3.125f, 3.75f, 3.125f)
                horizontalLineTo(16.25f)
                curveTo(16.4158f, 3.125f, 16.5747f, 3.1909f, 16.6919f, 3.3081f)
                curveTo(16.8092f, 3.4253f, 16.875f, 3.5842f, 16.875f, 3.75f)
                close()
            }
            path(fill = SolidColor(Color(0xFF2A2A2A)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(16.25f, 2.5f)
                horizontalLineTo(14.375f)
                verticalLineTo(1.875f)
                curveTo(14.375f, 1.7092f, 14.3092f, 1.5503f, 14.1919f, 1.4331f)
                curveTo(14.0747f, 1.3159f, 13.9158f, 1.25f, 13.75f, 1.25f)
                curveTo(13.5842f, 1.25f, 13.4253f, 1.3159f, 13.3081f, 1.4331f)
                curveTo(13.1908f, 1.5503f, 13.125f, 1.7092f, 13.125f, 1.875f)
                verticalLineTo(2.5f)
                horizontalLineTo(6.875f)
                verticalLineTo(1.875f)
                curveTo(6.875f, 1.7092f, 6.8092f, 1.5503f, 6.6919f, 1.4331f)
                curveTo(6.5747f, 1.3159f, 6.4158f, 1.25f, 6.25f, 1.25f)
                curveTo(6.0842f, 1.25f, 5.9253f, 1.3159f, 5.8081f, 1.4331f)
                curveTo(5.6908f, 1.5503f, 5.625f, 1.7092f, 5.625f, 1.875f)
                verticalLineTo(2.5f)
                horizontalLineTo(3.75f)
                curveTo(3.4185f, 2.5f, 3.1005f, 2.6317f, 2.8661f, 2.8661f)
                curveTo(2.6317f, 3.1005f, 2.5f, 3.4185f, 2.5f, 3.75f)
                verticalLineTo(16.25f)
                curveTo(2.5f, 16.5815f, 2.6317f, 16.8995f, 2.8661f, 17.1339f)
                curveTo(3.1005f, 17.3683f, 3.4185f, 17.5f, 3.75f, 17.5f)
                horizontalLineTo(16.25f)
                curveTo(16.5815f, 17.5f, 16.8995f, 17.3683f, 17.1339f, 17.1339f)
                curveTo(17.3683f, 16.8995f, 17.5f, 16.5815f, 17.5f, 16.25f)
                verticalLineTo(3.75f)
                curveTo(17.5f, 3.4185f, 17.3683f, 3.1005f, 17.1339f, 2.8661f)
                curveTo(16.8995f, 2.6317f, 16.5815f, 2.5f, 16.25f, 2.5f)
                close()
                moveTo(5.625f, 3.75f)
                verticalLineTo(4.375f)
                curveTo(5.625f, 4.5408f, 5.6908f, 4.6997f, 5.8081f, 4.8169f)
                curveTo(5.9253f, 4.9342f, 6.0842f, 5.0f, 6.25f, 5.0f)
                curveTo(6.4158f, 5.0f, 6.5747f, 4.9342f, 6.6919f, 4.8169f)
                curveTo(6.8092f, 4.6997f, 6.875f, 4.5408f, 6.875f, 4.375f)
                verticalLineTo(3.75f)
                horizontalLineTo(13.125f)
                verticalLineTo(4.375f)
                curveTo(13.125f, 4.5408f, 13.1908f, 4.6997f, 13.3081f, 4.8169f)
                curveTo(13.4253f, 4.9342f, 13.5842f, 5.0f, 13.75f, 5.0f)
                curveTo(13.9158f, 5.0f, 14.0747f, 4.9342f, 14.1919f, 4.8169f)
                curveTo(14.3092f, 4.6997f, 14.375f, 4.5408f, 14.375f, 4.375f)
                verticalLineTo(3.75f)
                horizontalLineTo(16.25f)
                verticalLineTo(6.25f)
                horizontalLineTo(3.75f)
                verticalLineTo(3.75f)
                horizontalLineTo(5.625f)
                close()
                moveTo(16.25f, 16.25f)
                horizontalLineTo(3.75f)
                verticalLineTo(7.5f)
                horizontalLineTo(16.25f)
                verticalLineTo(16.25f)
                close()
                moveTo(13.2547f, 9.5578f)
                curveTo(13.3128f, 9.6159f, 13.3589f, 9.6848f, 13.3904f, 9.7607f)
                curveTo(13.4218f, 9.8365f, 13.438f, 9.9179f, 13.438f, 10.0f)
                curveTo(13.438f, 10.0821f, 13.4218f, 10.1635f, 13.3904f, 10.2393f)
                curveTo(13.3589f, 10.3152f, 13.3128f, 10.3841f, 13.2547f, 10.4422f)
                lineTo(9.5047f, 14.1922f)
                curveTo(9.4466f, 14.2503f, 9.3777f, 14.2964f, 9.3018f, 14.3279f)
                curveTo(9.226f, 14.3593f, 9.1446f, 14.3755f, 9.0625f, 14.3755f)
                curveTo(8.9804f, 14.3755f, 8.899f, 14.3593f, 8.8232f, 14.3279f)
                curveTo(8.7473f, 14.2964f, 8.6784f, 14.2503f, 8.6203f, 14.1922f)
                lineTo(6.7453f, 12.3172f)
                curveTo(6.628f, 12.1999f, 6.5622f, 12.0409f, 6.5622f, 11.875f)
                curveTo(6.5622f, 11.7091f, 6.628f, 11.5501f, 6.7453f, 11.4328f)
                curveTo(6.8626f, 11.3155f, 7.0216f, 11.2497f, 7.1875f, 11.2497f)
                curveTo(7.3534f, 11.2497f, 7.5124f, 11.3155f, 7.6297f, 11.4328f)
                lineTo(9.0625f, 12.8664f)
                lineTo(12.3703f, 9.5578f)
                curveTo(12.4284f, 9.4997f, 12.4973f, 9.4536f, 12.5732f, 9.4221f)
                curveTo(12.649f, 9.3907f, 12.7304f, 9.3745f, 12.8125f, 9.3745f)
                curveTo(12.8946f, 9.3745f, 12.976f, 9.3907f, 13.0518f, 9.4221f)
                curveTo(13.1277f, 9.4536f, 13.1966f, 9.4997f, 13.2547f, 9.5578f)
                close()
            }
        }
        .build()
        return requireNotNull(_calendarIcon)
    }

private var _calendarIcon: ImageVector? = null
