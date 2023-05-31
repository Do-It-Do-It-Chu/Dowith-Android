package com.soopeach.dowith.ui.icons

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.group
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MoreIcon: ImageVector
    get() {
        if (_moreIcon != null) {
            return requireNotNull(_moreIcon)
        }
        _moreIcon = Builder(name = "MoreIcon", defaultWidth = 20.0.dp, defaultHeight = 20.0.dp,
                viewportWidth = 20.0f, viewportHeight = 20.0f).apply {
            group {
                path(fill = SolidColor(Color(0xFF949494)), stroke = null, strokeLineWidth = 0.0f,
                        strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                        pathFillType = NonZero) {
                    moveTo(5.1923f, 11.25f)
                    curveTo(4.8486f, 11.25f, 4.5543f, 11.1276f, 4.3095f, 10.8828f)
                    curveTo(4.0648f, 10.638f, 3.9424f, 10.3437f, 3.9424f, 10.0f)
                    curveTo(3.9424f, 9.6562f, 4.0648f, 9.362f, 4.3095f, 9.1172f)
                    curveTo(4.5543f, 8.8724f, 4.8486f, 8.75f, 5.1923f, 8.75f)
                    curveTo(5.5361f, 8.75f, 5.8304f, 8.8724f, 6.0751f, 9.1172f)
                    curveTo(6.3199f, 9.362f, 6.4423f, 9.6562f, 6.4423f, 10.0f)
                    curveTo(6.4423f, 10.3437f, 6.3199f, 10.638f, 6.0751f, 10.8828f)
                    curveTo(5.8304f, 11.1276f, 5.5361f, 11.25f, 5.1923f, 11.25f)
                    close()
                    moveTo(10.0f, 11.25f)
                    curveTo(9.6563f, 11.25f, 9.362f, 11.1276f, 9.1172f, 10.8828f)
                    curveTo(8.8724f, 10.638f, 8.75f, 10.3437f, 8.75f, 10.0f)
                    curveTo(8.75f, 9.6562f, 8.8724f, 9.362f, 9.1172f, 9.1172f)
                    curveTo(9.362f, 8.8724f, 9.6563f, 8.75f, 10.0f, 8.75f)
                    curveTo(10.3438f, 8.75f, 10.638f, 8.8724f, 10.8828f, 9.1172f)
                    curveTo(11.1276f, 9.362f, 11.25f, 9.6562f, 11.25f, 10.0f)
                    curveTo(11.25f, 10.3437f, 11.1276f, 10.638f, 10.8828f, 10.8828f)
                    curveTo(10.638f, 11.1276f, 10.3438f, 11.25f, 10.0f, 11.25f)
                    close()
                    moveTo(14.8077f, 11.25f)
                    curveTo(14.464f, 11.25f, 14.1697f, 11.1276f, 13.9249f, 10.8828f)
                    curveTo(13.6801f, 10.638f, 13.5577f, 10.3437f, 13.5577f, 10.0f)
                    curveTo(13.5577f, 9.6562f, 13.6801f, 9.362f, 13.9249f, 9.1172f)
                    curveTo(14.1697f, 8.8724f, 14.464f, 8.75f, 14.8077f, 8.75f)
                    curveTo(15.1515f, 8.75f, 15.4457f, 8.8724f, 15.6905f, 9.1172f)
                    curveTo(15.9353f, 9.362f, 16.0577f, 9.6562f, 16.0577f, 10.0f)
                    curveTo(16.0577f, 10.3437f, 15.9353f, 10.638f, 15.6905f, 10.8828f)
                    curveTo(15.4457f, 11.1276f, 15.1515f, 11.25f, 14.8077f, 11.25f)
                    close()
                }
            }
        }
        .build()
        return requireNotNull(_moreIcon)
    }

private var _moreIcon: ImageVector? = null
