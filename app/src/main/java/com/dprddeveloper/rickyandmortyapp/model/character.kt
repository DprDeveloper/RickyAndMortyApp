package com.dprddeveloper.rickyandmortyapp.model

import java.util.*

data class RmCharacter(val id: Int, val name: String, val image: String)
data class ResponseCharacter(val info: Objects, val results: List<RmCharacter>)
