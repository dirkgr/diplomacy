
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

  sealed trait Province {
    def longName: String
    def shortNames: Set[String]
    def tla: String
    def provinceType: ProvinceType
    def isSupplyCenter: Boolean
  }
  
  object Province {
    private case class ProvinceImpl(
      longName: String,
      shortNames: Set[String],
      tla: String,
      provinceType: ProvinceType,
      isSupplyCenter: Boolean
    )

    object Switzerland extends ProvinceImpl("Switzerland", Set("swi", "switz"), "swi", ProvinceType.Swiss, false) with Province
    object AdriaticSea extends ProvinceImpl("Adriatic Sea", Set("adr", "adriatic"), "adr", ProvinceType.Sea, false) with Province
    object AegeanSea extends ProvinceImpl("Aegean Sea", Set("aeg", "aegean"), "aeg", ProvinceType.Sea, false) with Province
    object Albania extends ProvinceImpl("Albania", Set("alb"), "alb", ProvinceType.Land, false) with Province
    object Ankara extends ProvinceImpl("Ankara", Set("ank"), "ank", ProvinceType.Land, true) with Province
    object Apulia extends ProvinceImpl("Apulia", Set("apu"), "apu", ProvinceType.Land, false) with Province
    object Armenia extends ProvinceImpl("Armenia", Set("arm"), "arm", ProvinceType.Land, false) with Province
    object BalticSea extends ProvinceImpl("Baltic Sea", Set("bal", "baltic"), "bal", ProvinceType.Sea, false) with Province
    object BarentsSea extends ProvinceImpl("Barents Sea", Set("w bar barents"), "bar", ProvinceType.Sea, false) with Province
    object Belgium extends ProvinceImpl("Belgium", Set("bel"), "bel", ProvinceType.Land, true) with Province
    object Berlin extends ProvinceImpl("Berlin", Set("ber"), "ber", ProvinceType.Land, true) with Province
    object BlackSea extends ProvinceImpl("Black Sea", Set("bla", "black"), "bla", ProvinceType.Sea, false) with Province
    object Bohemia extends ProvinceImpl("Bohemia", Set("boh"), "boh", ProvinceType.Land, false) with Province
    object Brest extends ProvinceImpl("Brest", Set("bre"), "bre", ProvinceType.Land, true) with Province
    object Budapest extends ProvinceImpl("Budapest", Set("bud"), "bud", ProvinceType.Land, true) with Province
    object Bulgaria extends ProvinceImpl("Bulgaria", Set("bul"), "bul", ProvinceType.Land, true) with Province
    object Burgundy extends ProvinceImpl("Burgundy", Set("bur"), "bur", ProvinceType.Land, false) with Province
    object Clyde extends ProvinceImpl("Clyde", Set("cly"), "cly", ProvinceType.Land, false) with Province
    object Constantinople extends ProvinceImpl("Constantinople", Set("con"), "con", ProvinceType.Land, true) with Province
    object Denmark extends ProvinceImpl("Denmark", Set("den"), "den", ProvinceType.Land, true) with Province
    object EasternMediterranean extends ProvinceImpl("Eastern Mediterranean", Set("eas", "emed", "east", "eastern", "eastmed", "ems", "eme"), "eas", ProvinceType.Sea, false) with Province
    object Edinburgh extends ProvinceImpl("Edinburgh", Set("edi"), "edi", ProvinceType.Land, true) with Province
    object EnglishChannel extends ProvinceImpl("English Channel", Set("eng", "english channel", "ech"), "eng", ProvinceType.Sea, false) with Province
    object Finland extends ProvinceImpl("Finland", Set("fin"), "fin", ProvinceType.Land, false) with Province
    object Galicia extends ProvinceImpl("Galicia", Set("gal"), "gal", ProvinceType.Land, false) with Province
    object Gascony extends ProvinceImpl("Gascony", Set("gas"), "gas", ProvinceType.Land, false) with Province
    object Greece extends ProvinceImpl("Greece", Set("gre"), "gre", ProvinceType.Land, true) with Province
    object GulfOfLyon extends ProvinceImpl("Gulf of Lyon", Set("lyo", "gol", "gulfofl", "lyon"), "lyo", ProvinceType.Sea, false) with Province
    object GulfOfBothnia extends ProvinceImpl("Gulf of Bothnia", Set("bot", "gob", "both", "gulfofb", "bothnia"), "bot", ProvinceType.Sea, false) with Province
    object HelgolandBight extends ProvinceImpl("Helgoland Bight", Set("hel", "helgoland"), "hel", ProvinceType.Sea, false) with Province
    object Holland extends ProvinceImpl("Holland", Set("hol"), "hol", ProvinceType.Land, true) with Province
    object IonianSea extends ProvinceImpl("Ionian Sea", Set("ion", "ionian"), "ion", ProvinceType.Sea, false) with Province
    object IrishSea extends ProvinceImpl("Irish Sea", Set("iri", "irish"), "iri", ProvinceType.Sea, false) with Province
    object Kiel extends ProvinceImpl("Kiel", Set("kie"), "kie", ProvinceType.Land, true) with Province
    object Liverpool extends ProvinceImpl("Liverpool", Set("lvp", "livp", "lpl"), "lvp", ProvinceType.Land, true) with Province
    object Livonia extends ProvinceImpl("Livonia", Set("lvn", "livo", "lvo", "lva"), "lvn", ProvinceType.Land, false) with Province
    object London extends ProvinceImpl("London", Set("lon"), "lon", ProvinceType.Land, true) with Province
    object Marseilles extends ProvinceImpl("Marseilles", Set("mar", "mars"), "mar", ProvinceType.Land, true) with Province
    object MidAtlanticOcean extends ProvinceImpl("Mid-Atlantic Ocean", Set("mao", "midatlanticocean", "midatlantic", "mid", "mat"), "mao", ProvinceType.Sea, false) with Province
    object Moscow extends ProvinceImpl("Moscow", Set("mos"), "mos", ProvinceType.Land, true) with Province
    object Munich extends ProvinceImpl("Munich", Set("mun"), "mun", ProvinceType.Land, true) with Province
    object Naples extends ProvinceImpl("Naples", Set("nap"), "nap", ProvinceType.Land, true) with Province
    object NorthAtlanticOcean extends ProvinceImpl("North Atlantic Ocean", Set("nao", "nat"), "nao", ProvinceType.Sea, false) with Province
    object NorthAfrica extends ProvinceImpl("North Africa", Set("naf", "nora"), "naf", ProvinceType.Land, false) with Province
    object NorthSea extends ProvinceImpl("North Sea", Set("nth", "norsea", "nts"), "nth", ProvinceType.Sea, false) with Province
    object Norway extends ProvinceImpl("Norway", Set("nor", "nwy", "norw"), "nor", ProvinceType.Land, true) with Province
    object NorwegianSea extends ProvinceImpl("Norwegian Sea", Set("nwg", "norwsea", "nrg", "norwegian"), "nwg", ProvinceType.Sea, false) with Province
    object Paris extends ProvinceImpl("Paris", Set("par"), "par", ProvinceType.Land, true) with Province
    object Picardy extends ProvinceImpl("Picardy", Set("pic"), "pic", ProvinceType.Land, false) with Province
    object Piedmont extends ProvinceImpl("Piedmont", Set("pie"), "pie", ProvinceType.Land, false) with Province
    object Portugal extends ProvinceImpl("Portugal", Set("por"), "por", ProvinceType.Land, true) with Province
    object Prussia extends ProvinceImpl("Prussia", Set("pru"), "pru", ProvinceType.Land, false) with Province
    object Rome extends ProvinceImpl("Rome", Set("rom"), "rom", ProvinceType.Land, true) with Province
    object Ruhr extends ProvinceImpl("Ruhr", Set("ruh"), "ruh", ProvinceType.Land, false) with Province
    object Rumania extends ProvinceImpl("Rumania", Set("rum"), "rum", ProvinceType.Land, true) with Province
    object Serbia extends ProvinceImpl("Serbia", Set("ser"), "ser", ProvinceType.Land, true) with Province
    object Sevastopol extends ProvinceImpl("Sevastopol", Set("sev", "sevastapol"), "sev", ProvinceType.Land, true) with Province
    object Silesia extends ProvinceImpl("Silesia", Set("sil"), "sil", ProvinceType.Land, false) with Province
    object Skagerrak extends ProvinceImpl("Skagerrak", Set("ska"), "ska", ProvinceType.Sea, false) with Province
    object Smyrna extends ProvinceImpl("Smyrna", Set("smy"), "smy", ProvinceType.Land, true) with Province
    object Spain extends ProvinceImpl("Spain", Set("spa"), "spa", ProvinceType.Land, true) with Province
    object StPetersburg extends ProvinceImpl("St Petersburg", Set("stp"), "stp", ProvinceType.Land, true) with Province
    object Sweden extends ProvinceImpl("Sweden", Set("swe"), "swe", ProvinceType.Land, true) with Province
    object Syria extends ProvinceImpl("Syria", Set("syr"), "syr", ProvinceType.Land, false) with Province
    object Trieste extends ProvinceImpl("Trieste", Set("tri"), "tri", ProvinceType.Land, true) with Province
    object Tunis extends ProvinceImpl("Tunis", Set("tun"), "tun", ProvinceType.Land, true) with Province
    object Tuscany extends ProvinceImpl("Tuscany", Set("tus"), "tus", ProvinceType.Land, false) with Province
    object Tyrolia extends ProvinceImpl("Tyrolia", Set("tyr", "tyl", "trl"), "tyr", ProvinceType.Land, false) with Province
    object TyrrhenianSea extends ProvinceImpl("Tyrrhenian Sea", Set("tys", "tyrr", "tyrrhenian", "tyn", "tyh"), "tys", ProvinceType.Sea, false) with Province
    object Ukraine extends ProvinceImpl("Ukraine", Set("ukr"), "ukr", ProvinceType.Land, false) with Province
    object Venice extends ProvinceImpl("Venice", Set("ven"), "ven", ProvinceType.Land, true) with Province
    object Vienna extends ProvinceImpl("Vienna", Set("vie"), "vie", ProvinceType.Land, true) with Province
    object Wales extends ProvinceImpl("Wales", Set("wal"), "wal", ProvinceType.Land, false) with Province
    object Warsaw extends ProvinceImpl("Warsaw", Set("war"), "war", ProvinceType.Land, true) with Province
    object WesternMediterranean extends ProvinceImpl("Western Mediterranean", Set("wes", "wmed", "west", "western", "westmed", "wms", "wme"), "wes", ProvinceType.Sea, false) with Province
    object Yorkshire extends ProvinceImpl("Yorkshire", Set("yor", "york", "yonkers"), "yor", ProvinceType.Land, false) with Province
  }
}
