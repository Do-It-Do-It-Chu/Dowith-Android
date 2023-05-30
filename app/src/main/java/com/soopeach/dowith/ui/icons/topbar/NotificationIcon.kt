package com.soopeach.dowith.ui.icons.topbar

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val NotificationIcon: ImageVector
    get() {
        if (_notificationIcon != null) {
            return requireNotNull(_notificationIcon)
        }
        _notificationIcon = Builder(
            name = "NotificationIcon", defaultWidth = 24.0.dp, defaultHeight
            = 24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF949494)), stroke = null, strokeLineWidth = 0.0f,
                strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                pathFillType = NonZero
            ) {
                moveTo(15.75f, 21.0f)
                curveTo(15.75f, 21.1989f, 15.671f, 21.3897f, 15.5303f, 21.5303f)
                curveTo(15.3897f, 21.671f, 15.1989f, 21.75f, 15.0f, 21.75f)
                horizontalLineTo(9.0f)
                curveTo(8.8011f, 21.75f, 8.6103f, 21.671f, 8.4697f, 21.5303f)
                curveTo(8.329f, 21.3897f, 8.25f, 21.1989f, 8.25f, 21.0f)
                curveTo(8.25f, 20.8011f, 8.329f, 20.6103f, 8.4697f, 20.4697f)
                curveTo(8.6103f, 20.329f, 8.8011f, 20.25f, 9.0f, 20.25f)
                horizontalLineTo(15.0f)
                curveTo(15.1989f, 20.25f, 15.3897f, 20.329f, 15.5303f, 20.4697f)
                curveTo(15.671f, 20.6103f, 15.75f, 20.8011f, 15.75f, 21.0f)
                close()
                moveTo(20.7947f, 16.4944f)
                curveTo(20.2735f, 15.5981f, 19.5f, 13.0622f, 19.5f, 9.75f)
                curveTo(19.5f, 7.7609f, 18.7098f, 5.8532f, 17.3033f, 4.4467f)
                curveTo(15.8968f, 3.0402f, 13.9891f, 2.25f, 12.0f, 2.25f)
                curveTo(10.0109f, 2.25f, 8.1032f, 3.0402f, 6.6967f, 4.4467f)
                curveTo(5.2902f, 5.8532f, 4.5f, 7.7609f, 4.5f, 9.75f)
                curveTo(4.5f, 13.0631f, 3.7256f, 15.5981f, 3.2053f, 16.4944f)
                curveTo(3.0724f, 16.7222f, 3.002f, 16.9811f, 3.0011f, 17.2449f)
                curveTo(3.0002f, 17.5086f, 3.0689f, 17.768f, 3.2002f, 17.9967f)
                curveTo(3.3315f, 18.2255f, 3.5208f, 18.4156f, 3.749f, 18.5478f)
                curveTo(3.9772f, 18.6801f, 4.2362f, 18.7498f, 4.5f, 18.75f)
                horizontalLineTo(19.5f)
                curveTo(19.7637f, 18.7496f, 20.0226f, 18.6798f, 20.2507f, 18.5475f)
                curveTo(20.4788f, 18.4151f, 20.668f, 18.225f, 20.7992f, 17.9963f)
                curveTo(20.9303f, 17.7676f, 20.9989f, 17.5083f, 20.998f, 17.2446f)
                curveTo(20.997f, 16.9809f, 20.9266f, 16.7222f, 20.7938f, 16.4944f)
                horizontalLineTo(20.7947f)
                close()
            }
        }
            .build()
        return requireNotNull(_notificationIcon)
    }

private var _notificationIcon: ImageVector? = null
