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

val MyPageIcon: ImageVector
    get() {
        if (_myPageIcon != null) {
            return requireNotNull(_myPageIcon)
        }
        _myPageIcon = Builder(name = "MyPageIcon", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF949494)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(16.125f, 11.25f)
                curveTo(16.125f, 12.0658f, 15.8831f, 12.8634f, 15.4298f, 13.5417f)
                curveTo(14.9766f, 14.2201f, 14.3323f, 14.7488f, 13.5786f, 15.061f)
                curveTo(12.8248f, 15.3732f, 11.9954f, 15.4549f, 11.1953f, 15.2957f)
                curveTo(10.3951f, 15.1366f, 9.6601f, 14.7437f, 9.0832f, 14.1668f)
                curveTo(8.5063f, 13.5899f, 8.1134f, 12.8549f, 7.9543f, 12.0547f)
                curveTo(7.7951f, 11.2546f, 7.8768f, 10.4252f, 8.189f, 9.6714f)
                curveTo(8.5012f, 8.9177f, 9.0299f, 8.2734f, 9.7083f, 7.8202f)
                curveTo(10.3866f, 7.3669f, 11.1842f, 7.125f, 12.0f, 7.125f)
                curveTo(13.0936f, 7.1262f, 14.1421f, 7.5612f, 14.9154f, 8.3345f)
                curveTo(15.6888f, 9.1079f, 16.1238f, 10.1564f, 16.125f, 11.25f)
                close()
                moveTo(21.75f, 12.0f)
                curveTo(21.75f, 13.9284f, 21.1782f, 15.8134f, 20.1068f, 17.4168f)
                curveTo(19.0355f, 19.0202f, 17.5127f, 20.2699f, 15.7312f, 21.0078f)
                curveTo(13.9496f, 21.7458f, 11.9892f, 21.9389f, 10.0979f, 21.5627f)
                curveTo(8.2066f, 21.1865f, 6.4693f, 20.2579f, 5.1057f, 18.8943f)
                curveTo(3.7422f, 17.5307f, 2.8135f, 15.7934f, 2.4374f, 13.9021f)
                curveTo(2.0611f, 12.0108f, 2.2542f, 10.0504f, 2.9922f, 8.2688f)
                curveTo(3.7301f, 6.4873f, 4.9798f, 4.9645f, 6.5832f, 3.8932f)
                curveTo(8.1866f, 2.8218f, 10.0716f, 2.25f, 12.0f, 2.25f)
                curveTo(14.585f, 2.2527f, 17.0634f, 3.2808f, 18.8913f, 5.1087f)
                curveTo(20.7192f, 6.9366f, 21.7473f, 9.415f, 21.75f, 12.0f)
                close()
                moveTo(20.25f, 12.0f)
                curveTo(20.2488f, 10.8896f, 20.0237f, 9.7908f, 19.5881f, 8.7693f)
                curveTo(19.1525f, 7.7479f, 18.5154f, 6.8248f, 17.7148f, 6.0553f)
                curveTo(16.9143f, 5.2857f, 15.9668f, 4.6855f, 14.929f, 4.2905f)
                curveTo(13.8911f, 3.8956f, 12.7843f, 3.7139f, 11.6747f, 3.7566f)
                curveTo(7.2591f, 3.9272f, 3.7378f, 7.605f, 3.75f, 12.0234f)
                curveTo(3.7542f, 14.0349f, 4.4961f, 15.9749f, 5.835f, 17.4759f)
                curveTo(6.3803f, 16.6851f, 7.0729f, 16.0068f, 7.875f, 15.4781f)
                curveTo(7.9434f, 15.433f, 8.0247f, 15.4114f, 8.1065f, 15.4169f)
                curveTo(8.1882f, 15.4223f, 8.266f, 15.4543f, 8.3278f, 15.5081f)
                curveTo(9.347f, 16.3897f, 10.6496f, 16.8749f, 11.9972f, 16.8749f)
                curveTo(13.3448f, 16.8749f, 14.6473f, 16.3897f, 15.6666f, 15.5081f)
                curveTo(15.7284f, 15.4543f, 15.8061f, 15.4223f, 15.8879f, 15.4169f)
                curveTo(15.9697f, 15.4114f, 16.051f, 15.433f, 16.1194f, 15.4781f)
                curveTo(16.9225f, 16.0065f, 17.6161f, 16.6848f, 18.1622f, 17.4759f)
                curveTo(19.5077f, 15.9694f, 20.251f, 14.0199f, 20.25f, 12.0f)
                close()
            }
        }
        .build()
        return requireNotNull(_myPageIcon)
    }

private var _myPageIcon: ImageVector? = null
