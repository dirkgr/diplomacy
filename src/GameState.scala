
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

  val provinces = Set(
    Province("Switzerland", Set("swi", "switz"), "swi", ProvinceType.Swiss, false),
    Province("Adriatic Sea", Set("adr", "adriatic"), "adr", ProvinceType.Sea, false),
    Province("Aegean Sea", Set("aeg", "aegean"), "aeg", ProvinceType.Sea, false),
    Province("Albania", Set("l alb"), "alb", ProvinceType.Land, false),
    Province("Ankara", Set("T ank"), "ank", ProvinceType.Land, true),
    Province("Apulia", Set("l apu"), "apu", ProvinceType.Land, false),
    Province("Armenia", Set("l arm"), "arm", ProvinceType.Land, false),
    Province("Baltic Sea", Set("w bal baltic"), "bal", ProvinceType.Sea, false),
    Province("Barents Sea", Set("w bar barents"), "bar", ProvinceType.Sea, false),
    Province("Belgium", Set("x bel"), "bel", ProvinceType.Land, true),
    Province("Berlin", Set("G ber"), "ber", ProvinceType.Land, true),
    Province("Black Sea", Set("w bla black"), "bla", ProvinceType.Sea, false),
    Province("Bohemia", Set("l boh"), "boh", ProvinceType.Land, false),
    Province("Brest", Set("F bre"), "bre", ProvinceType.Land, true),
    Province("Budapest", Set("A bud"), "bud", ProvinceType.Land, true),
    Province("Bulgaria", Set("x bul"), "bul", ProvinceType.Land, true),
    Province("Burgundy", Set("l bur"), "bur", ProvinceType.Land, false),
    Province("Clyde", Set("l cly"), "cly", ProvinceType.Land, false),
    Province("Constantinople", Set("T con"), "con", ProvinceType.Land, true),
    Province("Denmark", Set("x den"), "den", ProvinceType.Land, true),
    Province("Eastern Mediterranean", Set("w eas emed east eastern eastmed ems eme"), "eas", ProvinceType.Sea, false),
    Province("Edinburgh", Set("E edi"), "edi", ProvinceType.Land, true),
    Province("English Channel", Set("w eng english channel ech"), "eng", ProvinceType.Sea, false),
    Province("Finland", Set("l fin"), "fin", ProvinceType.Land, false),
    Province("Galicia", Set("l gal"), "gal", ProvinceType.Land, false),
    Province("Gascony", Set("l gas"), "gas", ProvinceType.Land, false),
    Province("Greece", Set("x gre"), "gre", ProvinceType.Land, true),
    Province("Gulf of Lyon", Set("w lyo gol gulfofl lyon"), "lyo", ProvinceType.Sea, false),
    Province("Gulf of Bothnia", Set("w bot gob both gulfofb bothnia"), "bot", ProvinceType.Sea, false),
    Province("Helgoland Bight", Set("w hel helgoland"), "hel", ProvinceType.Sea, false),
    Province("Holland", Set("x hol"), "hol", ProvinceType.Land, true),
    Province("Ionian Sea", Set("w ion ionian"), "ion", ProvinceType.Sea, false),
    Province("Irish Sea", Set("w iri irish"), "iri", ProvinceType.Sea, false),
    Province("Kiel", Set("G kie"), "kie", ProvinceType.Land, true),
    Province("Liverpool", Set("E lvp livp lpl"), "lvp", ProvinceType.Land, true),
    Province("Livonia", Set("l lvn livo lvo lva"), "lvn", ProvinceType.Land, false),
    Province("London", Set("E lon"), "lon", ProvinceType.Land, true),
    Province("Marseilles", Set("F mar mars"), "mar", ProvinceType.Land, true),
    Province("Mid-Atlantic Ocean", Set("w mao midatlanticocean midatlantic mid mat"), "mao", ProvinceType.Sea, false),
    Province("Moscow", Set("R mos"), "mos", ProvinceType.Land, true),
    Province("Munich", Set("G mun"), "mun", ProvinceType.Land, true),
    Province("Naples", Set("I nap"), "nap", ProvinceType.Land, true),
    Province("North Atlantic Ocean", Set("w nao nat"), "nao", ProvinceType.Sea, false),
    Province("North Africa", Set("l naf nora"), "naf", ProvinceType.Land, false),
    Province("North Sea", Set("w nth norsea nts"), "nth", ProvinceType.Sea, false),
    Province("Norway", Set("x nor nwy norw"), "nor", ProvinceType.Land, true),
    Province("Norwegian Sea", Set("w nwg norwsea nrg norwegian"), "nwg", ProvinceType.Sea, false),
    Province("Paris", Set("F par"), "par", ProvinceType.Land, true),
    Province("Picardy", Set("l pic"), "pic", ProvinceType.Land, false),
    Province("Piedmont", Set("l pie"), "pie", ProvinceType.Land, false),
    Province("Portugal", Set("x por"), "por", ProvinceType.Land, true),
    Province("Prussia", Set("l pru"), "pru", ProvinceType.Land, false),
    Province("Rome", Set("I rom"), "rom", ProvinceType.Land, true),
    Province("Ruhr", Set("l ruh"), "ruh", ProvinceType.Land, false),
    Province("Rumania", Set("x rum"), "rum", ProvinceType.Land, true),
    Province("Serbia", Set("x ser"), "ser", ProvinceType.Land, true),
    Province("Sevastopol", Set("R sev sevastapol"), "sev", ProvinceType.Land, true),
    Province("Silesia", Set("l sil"), "sil", ProvinceType.Land, false),
    Province("Skagerrak", Set("w ska"), "ska", ProvinceType.Sea, false),
    Province("Smyrna", Set("T smy"), "smy", ProvinceType.Land, true),
    Province("Spain", Set("x spa"), "spa", ProvinceType.Land, true),
    Province("St Petersburg", Set("R stp"), "stp", ProvinceType.Land, true),
    Province("Sweden", Set("x swe"), "swe", ProvinceType.Land, true),
    Province("Syria", Set("l syr"), "syr", ProvinceType.Land, false),
    Province("Trieste", Set("A tri"), "tri", ProvinceType.Land, true),
    Province("Tunis", Set("x tun"), "tun", ProvinceType.Land, true),
    Province("Tuscany", Set("l tus"), "tus", ProvinceType.Land, false),
    Province("Tyrolia", Set("l tyr tyl trl"), "tyr", ProvinceType.Land, false),
    Province("Tyrrhenian Sea", Set("w tys tyrr tyrrhenian tyn tyh"), "tys", ProvinceType.Sea, false),
    Province("Ukraine", Set("l ukr"), "ukr", ProvinceType.Land, false),
    Province("Venice", Set("I ven"), "ven", ProvinceType.Land, true),
    Province("Vienna", Set("A vie"), "vie", ProvinceType.Land, true),
    Province("Wales", Set("l wal"), "wal", ProvinceType.Land, false),
    Province("Warsaw", Set("R war"), "war", ProvinceType.Land, true),
    Province("Western Mediterranean", Set("w wes wmed west western westmed wms wme"), "wes", ProvinceType.Sea, false),
    Province("Yorkshire", Set("l yor york yonkers"), "yor", ProvinceType.Land, false)
  )
}
