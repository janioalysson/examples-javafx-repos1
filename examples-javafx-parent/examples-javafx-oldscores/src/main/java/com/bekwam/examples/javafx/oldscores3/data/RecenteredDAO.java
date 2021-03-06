/*
 * Copyright 2015 Bekwam, Inc
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package com.bekwam.examples.javafx.oldscores3.data;

/**
 * DAO for JSON scores files
 *
 * @author carl_000
 */
public interface RecenteredDAO {

    Integer lookup1995MathScore(Integer recenteredScore);

    Integer lookup1995VerbalScore(Integer recenteredScore);

    Integer lookupRecenteredMathScore(Integer score1995);

    Integer lookupRecenteredVerbalScore(Integer score1995);

    String getVerbalAttribution();

    String getMathAttribution();
}
