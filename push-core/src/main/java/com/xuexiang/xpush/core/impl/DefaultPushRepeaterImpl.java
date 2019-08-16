/*
 * Copyright (C) 2019 xuexiangjys(xuexiangjys@163.com)
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *       http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 *
 */

package com.xuexiang.xpush.core.impl;

import android.content.Context;
import android.os.Parcelable;

import com.xuexiang.xpush.core.IPushRepeater;
import com.xuexiang.xpush.util.TransmitDataUtils;

/**
 * 默认的消息推送中间件
 *
 * @author xuexiang
 * @since 2019-08-16 9:21
 */
public class DefaultPushRepeaterImpl implements IPushRepeater {

    @Override
    public void transmit(Context context, String action, Parcelable data) {
        TransmitDataUtils.sendPushData(context, action, data);
    }
}
