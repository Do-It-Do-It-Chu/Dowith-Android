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

val TrashCanIcon: ImageVector
    get() {
        if (_trashCanIcon != null) {
            return requireNotNull(_trashCanIcon)
        }
        _trashCanIcon = Builder(
            name = "TrashCan", defaultWidth = 20.0.dp, defaultHeight = 20.0.dp,
            viewportWidth = 20.0f, viewportHeight = 20.0f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF555555)), stroke = null, strokeLineWidth = 0.0f,
                strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                pathFillType = NonZero
            ) {
                moveTo(16.875f, 3.75f)
                horizontalLineTo(13.75f)
                verticalLineTo(3.125f)
                curveTo(13.75f, 2.6277f, 13.5525f, 2.1508f, 13.2008f, 1.7992f)
                curveTo(12.8492f, 1.4475f, 12.3723f, 1.25f, 11.875f, 1.25f)
                horizontalLineTo(8.125f)
                curveTo(7.6277f, 1.25f, 7.1508f, 1.4475f, 6.7992f, 1.7992f)
                curveTo(6.4475f, 2.1508f, 6.25f, 2.6277f, 6.25f, 3.125f)
                verticalLineTo(3.75f)
                horizontalLineTo(3.125f)
                curveTo(2.9592f, 3.75f, 2.8003f, 3.8159f, 2.6831f, 3.9331f)
                curveTo(2.5659f, 4.0503f, 2.5f, 4.2092f, 2.5f, 4.375f)
                curveTo(2.5f, 4.5408f, 2.5659f, 4.6997f, 2.6831f, 4.8169f)
                curveTo(2.8003f, 4.9342f, 2.9592f, 5.0f, 3.125f, 5.0f)
                horizontalLineTo(3.75f)
                verticalLineTo(16.25f)
                curveTo(3.75f, 16.5815f, 3.8817f, 16.8995f, 4.1161f, 17.1339f)
                curveTo(4.3505f, 17.3683f, 4.6685f, 17.5f, 5.0f, 17.5f)
                horizontalLineTo(15.0f)
                curveTo(15.3315f, 17.5f, 15.6495f, 17.3683f, 15.8839f, 17.1339f)
                curveTo(16.1183f, 16.8995f, 16.25f, 16.5815f, 16.25f, 16.25f)
                verticalLineTo(5.0f)
                horizontalLineTo(16.875f)
                curveTo(17.0408f, 5.0f, 17.1997f, 4.9342f, 17.3169f, 4.8169f)
                curveTo(17.4342f, 4.6997f, 17.5f, 4.5408f, 17.5f, 4.375f)
                curveTo(17.5f, 4.2092f, 17.4342f, 4.0503f, 17.3169f, 3.9331f)
                curveTo(17.1997f, 3.8159f, 17.0408f, 3.75f, 16.875f, 3.75f)
                close()
                moveTo(8.75f, 13.125f)
                curveTo(8.75f, 13.2908f, 8.6841f, 13.4497f, 8.5669f, 13.5669f)
                curveTo(8.4497f, 13.6842f, 8.2908f, 13.75f, 8.125f, 13.75f)
                curveTo(7.9592f, 13.75f, 7.8003f, 13.6842f, 7.6831f, 13.5669f)
                curveTo(7.5658f, 13.4497f, 7.5f, 13.2908f, 7.5f, 13.125f)
                verticalLineTo(8.125f)
                curveTo(7.5f, 7.9592f, 7.5658f, 7.8003f, 7.6831f, 7.6831f)
                curveTo(7.8003f, 7.5658f, 7.9592f, 7.5f, 8.125f, 7.5f)
                curveTo(8.2908f, 7.5f, 8.4497f, 7.5658f, 8.5669f, 7.6831f)
                curveTo(8.6841f, 7.8003f, 8.75f, 7.9592f, 8.75f, 8.125f)
                verticalLineTo(13.125f)
                close()
                moveTo(12.5f, 13.125f)
                curveTo(12.5f, 13.2908f, 12.4342f, 13.4497f, 12.3169f, 13.5669f)
                curveTo(12.1997f, 13.6842f, 12.0408f, 13.75f, 11.875f, 13.75f)
                curveTo(11.7092f, 13.75f, 11.5503f, 13.6842f, 11.4331f, 13.5669f)
                curveTo(11.3158f, 13.4497f, 11.25f, 13.2908f, 11.25f, 13.125f)
                verticalLineTo(8.125f)
                curveTo(11.25f, 7.9592f, 11.3158f, 7.8003f, 11.4331f, 7.6831f)
                curveTo(11.5503f, 7.5658f, 11.7092f, 7.5f, 11.875f, 7.5f)
                curveTo(12.0408f, 7.5f, 12.1997f, 7.5658f, 12.3169f, 7.6831f)
                curveTo(12.4342f, 7.8003f, 12.5f, 7.9592f, 12.5f, 8.125f)
                verticalLineTo(13.125f)
                close()
                moveTo(12.5f, 3.75f)
                horizontalLineTo(7.5f)
                verticalLineTo(3.125f)
                curveTo(7.5f, 2.9592f, 7.5658f, 2.8003f, 7.6831f, 2.6831f)
                curveTo(7.8003f, 2.5659f, 7.9592f, 2.5f, 8.125f, 2.5f)
                horizontalLineTo(11.875f)
                curveTo(12.0408f, 2.5f, 12.1997f, 2.5659f, 12.3169f, 2.6831f)
                curveTo(12.4342f, 2.8003f, 12.5f, 2.9592f, 12.5f, 3.125f)
                verticalLineTo(3.75f)
                close()
            }
        }
            .build()
        return requireNotNull(_trashCanIcon)
    }

private var _trashCanIcon: ImageVector? = null
