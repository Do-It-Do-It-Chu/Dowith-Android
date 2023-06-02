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

val DoneIcon: ImageVector
    get() {
        if (_doneIcon != null) {
            return requireNotNull(_doneIcon)
        }
        _doneIcon = Builder(name = "TodoIcon", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
            viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFFFF7F00)), stroke = null, strokeLineWidth = 0.0f,
                strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                pathFillType = NonZero) {
                moveTo(19.5f, 3.0f)
                horizontalLineTo(4.5f)
                curveTo(4.1022f, 3.0f, 3.7206f, 3.158f, 3.4393f, 3.4393f)
                curveTo(3.158f, 3.7206f, 3.0f, 4.1022f, 3.0f, 4.5f)
                verticalLineTo(19.5f)
                curveTo(3.0f, 19.8978f, 3.158f, 20.2794f, 3.4393f, 20.5607f)
                curveTo(3.7206f, 20.842f, 4.1022f, 21.0f, 4.5f, 21.0f)
                horizontalLineTo(19.5f)
                curveTo(19.8978f, 21.0f, 20.2794f, 20.842f, 20.5607f, 20.5607f)
                curveTo(20.842f, 20.2794f, 21.0f, 19.8978f, 21.0f, 19.5f)
                verticalLineTo(4.5f)
                curveTo(21.0f, 4.1022f, 20.842f, 3.7206f, 20.5607f, 3.4393f)
                curveTo(20.2794f, 3.158f, 19.8978f, 3.0f, 19.5f, 3.0f)
                close()
                moveTo(16.2806f, 10.2806f)
                lineTo(11.0306f, 15.5306f)
                curveTo(10.961f, 15.6004f, 10.8783f, 15.6557f, 10.7872f, 15.6934f)
                curveTo(10.6962f, 15.7312f, 10.5986f, 15.7506f, 10.5f, 15.7506f)
                curveTo(10.4014f, 15.7506f, 10.3038f, 15.7312f, 10.2128f, 15.6934f)
                curveTo(10.1217f, 15.6557f, 10.039f, 15.6004f, 9.9694f, 15.5306f)
                lineTo(7.7194f, 13.2806f)
                curveTo(7.5786f, 13.1399f, 7.4996f, 12.949f, 7.4996f, 12.75f)
                curveTo(7.4996f, 12.551f, 7.5786f, 12.3601f, 7.7194f, 12.2194f)
                curveTo(7.8601f, 12.0786f, 8.051f, 11.9996f, 8.25f, 11.9996f)
                curveTo(8.449f, 11.9996f, 8.6399f, 12.0786f, 8.7806f, 12.2194f)
                lineTo(10.5f, 13.9397f)
                lineTo(15.2194f, 9.2194f)
                curveTo(15.2891f, 9.1497f, 15.3718f, 9.0944f, 15.4628f, 9.0567f)
                curveTo(15.5539f, 9.019f, 15.6515f, 8.9996f, 15.75f, 8.9996f)
                curveTo(15.8485f, 8.9996f, 15.9461f, 9.019f, 16.0372f, 9.0567f)
                curveTo(16.1282f, 9.0944f, 16.2109f, 9.1497f, 16.2806f, 9.2194f)
                curveTo(16.3503f, 9.2891f, 16.4056f, 9.3718f, 16.4433f, 9.4628f)
                curveTo(16.481f, 9.5539f, 16.5004f, 9.6515f, 16.5004f, 9.75f)
                curveTo(16.5004f, 9.8485f, 16.481f, 9.9461f, 16.4433f, 10.0372f)
                curveTo(16.4056f, 10.1282f, 16.3503f, 10.2109f, 16.2806f, 10.2806f)
                close()
            }
        }
        .build()
        return requireNotNull(_doneIcon)
    }

private var _doneIcon: ImageVector? = null
