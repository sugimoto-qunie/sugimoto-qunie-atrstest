/*
 * Copyright(c) 2015 NTT Corporation.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND,
 * either express or implied. See the License for the specific language
 * governing permissions and limitations under the License.
 */
package jp.co.ntt.atrs.domain.repository.peaktime;

import java.util.List;

import jp.co.ntt.atrs.domain.model.PeakTime;

/**
 * ピーク時期テーブルにアクセスするリポジトリインターフェース。
 * @author NTT 電電太郎
 */
public interface PeakTimeRepository {

    /**
     * 全てのピーク時期を取得する。
     * @return ピーク時期リスト
     */
    List<PeakTime> findAll();
}
