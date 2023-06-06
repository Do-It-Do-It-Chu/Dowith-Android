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

val CantNotifyIcon: ImageVector
    get() {
        if (_cantNotifyIcon != null) {
            return requireNotNull(_cantNotifyIcon)
        }
        _cantNotifyIcon = Builder(name = "CantNotifyIcon", defaultWidth = 28.0.dp, defaultHeight =
                28.0.dp, viewportWidth = 28.0f, viewportHeight = 28.0f).apply {
            path(fill = SolidColor(Color(0xFFEFEFEF)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(14.0f, 14.0f)
                moveToRelative(-14.0f, 0.0f)
                arcToRelative(14.0f, 14.0f, 0.0f, true, true, 28.0f, 0.0f)
                arcToRelative(14.0f, 14.0f, 0.0f, true, true, -28.0f, 0.0f)
            }
            path(fill = SolidColor(Color(0xFFffffff)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(16.5f, 20.0f)
                curveTo(16.5f, 20.1326f, 16.4473f, 20.2598f, 16.3535f, 20.3536f)
                curveTo(16.2598f, 20.4474f, 16.1326f, 20.5f, 16.0f, 20.5f)
                horizontalLineTo(12.0f)
                curveTo(11.8674f, 20.5f, 11.7402f, 20.4474f, 11.6464f, 20.3536f)
                curveTo(11.5526f, 20.2598f, 11.5f, 20.1326f, 11.5f, 20.0f)
                curveTo(11.5f, 19.8674f, 11.5526f, 19.7402f, 11.6464f, 19.6465f)
                curveTo(11.7402f, 19.5527f, 11.8674f, 19.5f, 12.0f, 19.5f)
                horizontalLineTo(16.0f)
                curveTo(16.1326f, 19.5f, 16.2598f, 19.5527f, 16.3535f, 19.6465f)
                curveTo(16.4473f, 19.7402f, 16.5f, 19.8674f, 16.5f, 20.0f)
                close()
                moveTo(20.2118f, 9.77f)
                curveTo(19.6499f, 8.6717f, 18.8061f, 7.7425f, 17.7668f, 7.0775f)
                curveTo(17.7113f, 7.0421f, 17.6493f, 7.0179f, 17.5844f, 7.0065f)
                curveTo(17.5196f, 6.995f, 17.453f, 6.9966f, 17.3887f, 7.0109f)
                curveTo(17.3244f, 7.0253f, 17.2636f, 7.0522f, 17.2097f, 7.0901f)
                curveTo(17.1559f, 7.1281f, 17.11f, 7.1763f, 17.0749f, 7.232f)
                curveTo(17.0397f, 7.2877f, 17.0159f, 7.3499f, 17.0048f, 7.4148f)
                curveTo(16.9937f, 7.4798f, 16.9956f, 7.5463f, 17.0103f, 7.6105f)
                curveTo(17.025f, 7.6747f, 17.0523f, 7.7354f, 17.0905f, 7.7891f)
                curveTo(17.1287f, 7.8427f, 17.1772f, 7.8883f, 17.2331f, 7.9232f)
                curveTo(18.1247f, 8.4903f, 18.8471f, 9.2872f, 19.3243f, 10.23f)
                curveTo(19.3874f, 10.344f, 19.4925f, 10.4288f, 19.6171f, 10.4665f)
                curveTo(19.7418f, 10.5042f, 19.8763f, 10.4918f, 19.9919f, 10.4318f)
                curveTo(20.1075f, 10.3719f, 20.1952f, 10.2692f, 20.2363f, 10.1456f)
                curveTo(20.2774f, 10.022f, 20.2686f, 9.8873f, 20.2118f, 9.77f)
                close()
                moveTo(8.2318f, 10.5f)
                curveTo(8.3235f, 10.5f, 8.4133f, 10.4748f, 8.4915f, 10.4272f)
                curveTo(8.5698f, 10.3796f, 8.6335f, 10.3114f, 8.6756f, 10.23f)
                curveTo(9.1529f, 9.2872f, 9.8752f, 8.4903f, 10.7668f, 7.9232f)
                curveTo(10.8228f, 7.8883f, 10.8712f, 7.8427f, 10.9095f, 7.7891f)
                curveTo(10.9477f, 7.7354f, 10.9749f, 7.6747f, 10.9896f, 7.6105f)
                curveTo(11.0044f, 7.5463f, 11.0062f, 7.4798f, 10.9951f, 7.4148f)
                curveTo(10.9841f, 7.3499f, 10.9602f, 7.2877f, 10.9251f, 7.232f)
                curveTo(10.8899f, 7.1763f, 10.8441f, 7.1281f, 10.7902f, 7.0901f)
                curveTo(10.7363f, 7.0522f, 10.6755f, 7.0253f, 10.6112f, 7.0109f)
                curveTo(10.5469f, 6.9966f, 10.4804f, 6.995f, 10.4155f, 7.0065f)
                curveTo(10.3506f, 7.0179f, 10.2886f, 7.0421f, 10.2331f, 7.0775f)
                curveTo(9.1939f, 7.7425f, 8.35f, 8.6717f, 7.7881f, 9.77f)
                curveTo(7.7486f, 9.8462f, 7.7294f, 9.9313f, 7.7323f, 10.0171f)
                curveTo(7.7353f, 10.1028f, 7.7602f, 10.1864f, 7.8048f, 10.2598f)
                curveTo(7.8494f, 10.3331f, 7.9121f, 10.3937f, 7.9869f, 10.4358f)
                curveTo(8.0617f, 10.4779f, 8.146f, 10.5f, 8.2318f, 10.5f)
                close()
                moveTo(19.0f, 13.0f)
                curveTo(19.0f, 11.674f, 18.4732f, 10.4022f, 17.5355f, 9.4645f)
                curveTo(16.5978f, 8.5268f, 15.3261f, 8.0f, 14.0f, 8.0f)
                curveTo(12.6739f, 8.0f, 11.4021f, 8.5268f, 10.4644f, 9.4645f)
                curveTo(9.5268f, 10.4022f, 9.0f, 11.674f, 9.0f, 13.0f)
                curveTo(9.0f, 14.6425f, 8.7012f, 16.0244f, 8.1369f, 16.9963f)
                curveTo(8.0483f, 17.1482f, 8.0013f, 17.3208f, 8.0007f, 17.4966f)
                curveTo(8.0001f, 17.6724f, 8.0459f, 17.8453f, 8.1334f, 17.9978f)
                curveTo(8.2209f, 18.1503f, 8.3471f, 18.2771f, 8.4993f, 18.3652f)
                curveTo(8.6514f, 18.4534f, 8.8241f, 18.4999f, 9.0f, 18.5f)
                horizontalLineTo(19.0f)
                curveTo(19.1757f, 18.4997f, 19.3483f, 18.453f, 19.5002f, 18.3648f)
                curveTo(19.6522f, 18.2765f, 19.7782f, 18.1498f, 19.8656f, 17.9973f)
                curveTo(19.953f, 17.8448f, 19.9986f, 17.672f, 19.998f, 17.4963f)
                curveTo(19.9973f, 17.3206f, 19.9504f, 17.1481f, 19.8618f, 16.9963f)
                curveTo(19.2987f, 16.0238f, 19.0f, 14.6419f, 19.0f, 13.0f)
                close()
            }
        }
        .build()
        return requireNotNull(_cantNotifyIcon)
    }

private var _cantNotifyIcon: ImageVector? = null
