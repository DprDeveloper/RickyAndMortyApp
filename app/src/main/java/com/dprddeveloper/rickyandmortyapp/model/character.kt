package com.dprddeveloper.rickyandmortyapp.model

import java.util.*

data class RmCharacter(val id: Int, val name: String, val url: String)
data class ResponseCharacter(val info: Objects, val result: List<RmCharacter>)
