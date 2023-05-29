package com.soopeach.dowith.ui.icons

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.EvenOdd
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Logo: ImageVector
    get() {
        if (_logo != null) {
            return requireNotNull(_logo)
        }
        _logo = Builder(name = "Logo", defaultWidth = 60.0.dp, defaultHeight = 23.0.dp,
                viewportWidth = 60.0f, viewportHeight = 23.0f).apply {
            path(fill = SolidColor(Color(0xFFFF7F00)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(28.6298f, 11.2715f)
                curveTo(28.6298f, 16.5707f, 24.9861f, 21.8699f, 16.4542f, 21.8699f)
                horizontalLineTo(2.3216f)
                curveTo(1.0389f, 21.8699f, 0.0f, 20.8148f, 0.0f, 19.5121f)
                verticalLineTo(3.1995f)
                curveTo(0.0f, 1.8968f, 1.0389f, 0.8416f, 2.3216f, 0.8416f)
                horizontalLineTo(16.4542f)
                curveTo(25.123f, 0.8416f, 28.6298f, 6.0571f, 28.6298f, 11.2727f)
                verticalLineTo(11.2715f)
                close()
                moveTo(10.9602f, 13.7955f)
                horizontalLineTo(14.301f)
                curveTo(15.9296f, 13.7955f, 16.8965f, 12.6461f, 16.8965f, 11.3564f)
                curveTo(16.8965f, 10.0666f, 15.9307f, 8.9172f, 14.2464f, 8.9172f)
                horizontalLineTo(10.9614f)
                curveTo(10.9428f, 8.9172f, 10.9335f, 8.9361f, 10.9335f, 8.9738f)
                verticalLineTo(13.7401f)
                curveTo(10.9335f, 13.7778f, 10.9428f, 13.7967f, 10.9614f, 13.7967f)
                lineTo(10.9602f, 13.7955f)
                close()
            }
            path(fill = SolidColor(Color(0xFFFF7F00)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(29.1824f, 11.3282f)
                curveTo(29.1824f, 4.7109f, 34.2341f, 0.0f, 44.3667f, 0.0f)
                curveTo(54.4993f, 0.0f, 59.5511f, 4.7109f, 59.5511f, 11.3282f)
                curveTo(59.5511f, 17.2722f, 55.3269f, 22.7117f, 44.3667f, 22.7117f)
                curveTo(33.4065f, 22.7117f, 29.1824f, 17.2722f, 29.1824f, 11.3282f)
                close()
                moveTo(44.3946f, 13.7956f)
                curveTo(46.9065f, 13.7956f, 47.8178f, 12.5342f, 47.8178f, 11.3282f)
                curveTo(47.8178f, 10.2341f, 46.9622f, 8.9173f, 44.3946f, 8.9173f)
                curveTo(41.8269f, 8.9173f, 40.9157f, 10.1787f, 40.9157f, 11.3565f)
                curveTo(40.9157f, 12.5342f, 41.8269f, 13.7956f, 44.3946f, 13.7956f)
                close()
            }
            path(fill = SolidColor(Color(0xFFFF7F00)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(43.8141f, 16.6107f)
                curveTo(46.908f, 16.6107f, 49.4161f, 14.0635f, 49.4161f, 10.9213f)
                curveTo(49.4161f, 7.7791f, 46.908f, 5.2318f, 43.8141f, 5.2318f)
                curveTo(40.7202f, 5.2318f, 38.2121f, 7.7791f, 38.2121f, 10.9213f)
                curveTo(38.2121f, 14.0635f, 40.7202f, 16.6107f, 43.8141f, 16.6107f)
                close()
            }
            path(fill = SolidColor(Color(0xFFffffff)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = EvenOdd) {
                moveTo(50.9092f, 6.3943f)
                curveTo(51.5875f, 7.0084f, 51.6472f, 8.0648f, 51.0425f, 8.7537f)
                lineTo(44.5223f, 16.182f)
                curveTo(43.9374f, 16.8484f, 42.9401f, 16.9302f, 42.2575f, 16.3678f)
                lineTo(37.8186f, 12.7108f)
                curveTo(37.1129f, 12.1294f, 37.0049f, 11.077f, 37.5773f, 10.3603f)
                curveTo(38.1498f, 9.6435f, 39.186f, 9.5338f, 39.8918f, 10.1152f)
                lineTo(43.1109f, 12.7674f)
                lineTo(48.586f, 6.5297f)
                curveTo(49.1907f, 5.8408f, 50.2308f, 5.7801f, 50.9092f, 6.3943f)
                close()
            }
        }
        .build()
        return requireNotNull(_logo)
    }

private var _logo: ImageVector? = null
