
case class GameState(
  year: Int,
  season: GameState.Season
)

object GameState {

  sealed trait Season

  object Season {
    object Spring extends Season
    object Fall extends Season
  }

  sealed trait ProvinceType

  object ProvinceType {
    object Land extends ProvinceType
    object Sea extends ProvinceType
    object Swiss extends ProvinceType
  }

  case class Province(
    longName: String,
    shortNames: Set[String],
    tla: String,
    provinceType: ProvinceType,
    isSupplyCenter: Boolean
  )

  object Province {
    object Switzerland extends Province("Switzerland", Set("swi", "switz"), "swi", ProvinceType.Swiss, false)
    object AdriaticSea extends Province("Adriatic Sea", Set("adr", "adriatic"), "adr", ProvinceType.Sea, false)
    object AegeanSea extends Province("Aegean Sea", Set("aeg", "aegean"), "aeg", ProvinceType.Sea, false)
    object Albania extends Province("Albania", Set("alb"), "alb", ProvinceType.Land, false)
    object Ankara extends Province("Ankara", Set("ank"), "ank", ProvinceType.Land, true)
    object Apulia extends Province("Apulia", Set("apu"), "apu", ProvinceType.Land, false)
    object Armenia extends Province("Armenia", Set("arm"), "arm", ProvinceType.Land, false)
    object BalticSea extends Province("Baltic Sea", Set("bal", "baltic"), "bal", ProvinceType.Sea, false)
    object BarentsSea extends Province("Barents Sea", Set("w bar barents"), "bar", ProvinceType.Sea, false)
    object Belgium extends Province("Belgium", Set("bel"), "bel", ProvinceType.Land, true)
    object Berlin extends Province("Berlin", Set("ber"), "ber", ProvinceType.Land, true)
    object BlackSea extends Province("Black Sea", Set("bla", "black"), "bla", ProvinceType.Sea, false)
    object Bohemia extends Province("Bohemia", Set("boh"), "boh", ProvinceType.Land, false)
    object Brest extends Province("Brest", Set("bre"), "bre", ProvinceType.Land, true)
    object Budapest extends Province("Budapest", Set("bud"), "bud", ProvinceType.Land, true)
    object Bulgaria extends Province("Bulgaria", Set("bul"), "bul", ProvinceType.Land, true)
    object Burgundy extends Province("Burgundy", Set("bur"), "bur", ProvinceType.Land, false)
    object Clyde extends Province("Clyde", Set("cly"), "cly", ProvinceType.Land, false)
    object Constantinople extends Province("Constantinople", Set("con"), "con", ProvinceType.Land, true)
    object Denmark extends Province("Denmark", Set("den"), "den", ProvinceType.Land, true)
    object EasternMediterranean extends Province("Eastern Mediterranean", Set("eas", "emed", "east", "eastern", "eastmed", "ems", "eme"), "eas", ProvinceType.Sea, false)
    object Edinburgh extends Province("Edinburgh", Set("edi"), "edi", ProvinceType.Land, true)
    object EnglishChannel extends Province("English Channel", Set("eng", "english channel", "ech"), "eng", ProvinceType.Sea, false)
    object Finland extends Province("Finland", Set("fin"), "fin", ProvinceType.Land, false)
    object Galicia extends Province("Galicia", Set("gal"), "gal", ProvinceType.Land, false)
    object Gascony extends Province("Gascony", Set("gas"), "gas", ProvinceType.Land, false)
    object Greece extends Province("Greece", Set("gre"), "gre", ProvinceType.Land, true)
    object GulfOfLyon extends Province("Gulf of Lyon", Set("lyo", "gol", "gulfofl", "lyon"), "lyo", ProvinceType.Sea, false)
    object GulfOfBothnia extends Province("Gulf of Bothnia", Set("bot", "gob", "both", "gulfofb", "bothnia"), "bot", ProvinceType.Sea, false)
    object HelgolandBight extends Province("Helgoland Bight", Set("hel", "helgoland"), "hel", ProvinceType.Sea, false)
    object Holland extends Province("Holland", Set("hol"), "hol", ProvinceType.Land, true)
    object IonianSea extends Province("Ionian Sea", Set("ion", "ionian"), "ion", ProvinceType.Sea, false)
    object IrishSea extends Province("Irish Sea", Set("iri", "irish"), "iri", ProvinceType.Sea, false)
    object Kiel extends Province("Kiel", Set("kie"), "kie", ProvinceType.Land, true)
    object Liverpool extends Province("Liverpool", Set("lvp", "livp", "lpl"), "lvp", ProvinceType.Land, true)
    object Livonia extends Province("Livonia", Set("lvn", "livo", "lvo", "lva"), "lvn", ProvinceType.Land, false)
    object London extends Province("London", Set("lon"), "lon", ProvinceType.Land, true)
    object Marseilles extends Province("Marseilles", Set("mar", "mars"), "mar", ProvinceType.Land, true)
    object MidAtlanticOcean extends Province("Mid-Atlantic Ocean", Set("mao", "midatlanticocean", "midatlantic", "mid", "mat"), "mao", ProvinceType.Sea, false)
    object Moscow extends Province("Moscow", Set("mos"), "mos", ProvinceType.Land, true)
    object Munich extends Province("Munich", Set("mun"), "mun", ProvinceType.Land, true)
    object Naples extends Province("Naples", Set("nap"), "nap", ProvinceType.Land, true)
    object NorthAtlanticOcean extends Province("North Atlantic Ocean", Set("nao", "nat"), "nao", ProvinceType.Sea, false)
    object NorthAfrica extends Province("North Africa", Set("naf", "nora"), "naf", ProvinceType.Land, false)
    object NorthSea extends Province("North Sea", Set("nth", "norsea", "nts"), "nth", ProvinceType.Sea, false)
    object Norway extends Province("Norway", Set("nor", "nwy", "norw"), "nor", ProvinceType.Land, true)
    object NorwegianSea extends Province("Norwegian Sea", Set("nwg", "norwsea", "nrg", "norwegian"), "nwg", ProvinceType.Sea, false)
    object Paris extends Province("Paris", Set("par"), "par", ProvinceType.Land, true)
    object Picardy extends Province("Picardy", Set("pic"), "pic", ProvinceType.Land, false)
    object Piedmont extends Province("Piedmont", Set("pie"), "pie", ProvinceType.Land, false)
    object Portugal extends Province("Portugal", Set("por"), "por", ProvinceType.Land, true)
    object Prussia extends Province("Prussia", Set("pru"), "pru", ProvinceType.Land, false)
    object Rome extends Province("Rome", Set("rom"), "rom", ProvinceType.Land, true)
    object Ruhr extends Province("Ruhr", Set("ruh"), "ruh", ProvinceType.Land, false)
    object Rumania extends Province("Rumania", Set("rum"), "rum", ProvinceType.Land, true)
    object Serbia extends Province("Serbia", Set("ser"), "ser", ProvinceType.Land, true)
    object Sevastopol extends Province("Sevastopol", Set("sev", "sevastapol"), "sev", ProvinceType.Land, true)
    object Silesia extends Province("Silesia", Set("sil"), "sil", ProvinceType.Land, false)
    object Skagerrak extends Province("Skagerrak", Set("ska"), "ska", ProvinceType.Sea, false)
    object Smyrna extends Province("Smyrna", Set("smy"), "smy", ProvinceType.Land, true)
    object Spain extends Province("Spain", Set("spa"), "spa", ProvinceType.Land, true)
    object StPetersburg extends Province("St Petersburg", Set("stp"), "stp", ProvinceType.Land, true)
    object Sweden extends Province("Sweden", Set("swe"), "swe", ProvinceType.Land, true)
    object Syria extends Province("Syria", Set("syr"), "syr", ProvinceType.Land, false)
    object Trieste extends Province("Trieste", Set("tri"), "tri", ProvinceType.Land, true)
    object Tunis extends Province("Tunis", Set("tun"), "tun", ProvinceType.Land, true)
    object Tuscany extends Province("Tuscany", Set("tus"), "tus", ProvinceType.Land, false)
    object Tyrolia extends Province("Tyrolia", Set("tyr", "tyl", "trl"), "tyr", ProvinceType.Land, false)
    object TyrrhenianSea extends Province("Tyrrhenian Sea", Set("tys", "tyrr", "tyrrhenian", "tyn", "tyh"), "tys", ProvinceType.Sea, false)
    object Ukraine extends Province("Ukraine", Set("ukr"), "ukr", ProvinceType.Land, false)
    object Venice extends Province("Venice", Set("ven"), "ven", ProvinceType.Land, true)
    object Vienna extends Province("Vienna", Set("vie"), "vie", ProvinceType.Land, true)
    object Wales extends Province("Wales", Set("wal"), "wal", ProvinceType.Land, false)
    object Warsaw extends Province("Warsaw", Set("war"), "war", ProvinceType.Land, true)
    object WesternMediterranean extends Province("Western Mediterranean", Set("wes", "wmed", "west", "western", "westmed", "wms", "wme"), "wes", ProvinceType.Sea, false)
    object Yorkshire extends Province("Yorkshire", Set("yor", "york", "yonkers"), "yor", ProvinceType.Land, false)
  }
}
