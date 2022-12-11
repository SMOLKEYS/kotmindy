package kotmindy.mindustry.events

import mindustry.game.EventType.*
import kotmindy.arc.events.*

//TODO only defines common events

fun win(cons: WinEvent.() -> Unit) = listen<WinEvent>(cons)

fun lose(cons: LoseEvent.() -> Unit) = listen<LoseEvent>(cons)

fun resize(cons: ResizeEvent.() -> Unit) = listen<ResizeEvent>(cons)

fun mapMake(cons: MapMakeEvent.() -> Unit) = listen<MapMakeEvent>(cons)

fun mapPublish(cons: MapPublishEvent.() -> Unit) = listen<MapPublishEvent>(cons)

fun saveWrite(cons: SaveWriteEvent.() -> Unit) = listen<SaveWriteEvent>(cons)

fun clientCreate(cons: ClientCreateEvent.() -> Unit) = listen<ClientCreateEvent>(cons)

fun serverLoad(cons: ServerLoadEvent.() -> Unit) = listen<ServerLoadEvent>(cons)

fun dispose(cons: DisposeEvent.() -> Unit) = listen<DisposeEvent>(cons)

fun play(cons: PlayEvent.() -> Unit) = listen<PlayEvent>(cons)

fun reset(cons: ResetEvent.() -> Unit) = listen<ResetEvent>(cons)

fun host(cons: HostEvent.() -> Unit) = listen<HostEvent>(cons)

fun wave(cons: WaveEvent.() -> Unit) = listen<WaveEvent>(cons)

fun turn(cons: TurnEvent.() -> Unit) = listen<TurnEvent>(cons)

fun lineConfirm(cons: LineConfirmEvent.() -> Unit) = listen<LineConfirmEvent>(cons)

fun turretAmmoDeliver(cons: TurretAmmoDeliverEvent.() -> Unit) = listen<TurretAmmoDeliverEvent>(cons)

fun coreItemDeliver(cons: CoreItemDeliverEvent.() -> Unit) = listen<CoreItemDeliverEvent>(cons)

fun blockInfo(cons: BlockInfoEvent.() -> Unit) = listen<BlockInfoEvent>(cons)

fun contentInit(cons: ContentInitEvent.() -> Unit) = listen<ContentInitEvent>(cons)

fun clientLoad(cons: ClientLoadEvent.() -> Unit) = listen<ClientLoadEvent>(cons)

fun musicRegister(cons: MusicRegisterEvent.() -> Unit) = listen<MusicRegisterEvent>(cons)

fun fileTreeInit(cons: FileTreeInitEvent.() -> Unit) = listen<FileTreeInitEvent>(cons)

fun worldLoad(cons: WorldLoadEvent.() -> Unit) = listen<WorldLoadEvent>(cons)

fun worldLoadBegin(cons: WorldLoadBeginEvent.() -> Unit) = listen<WorldLoadBeginEvent>(cons)

fun worldLoadEnd(cons: WorldLoadEndEvent.() -> Unit) = listen<WorldLoadEndEvent>(cons)

fun saveLoad(cons: SaveLoadEvent.() -> Unit) = listen<SaveLoadEvent>(cons)

fun sectorLose(cons: SectorLoseEvent.() -> Unit) = listen<SectorLoseEvent>(cons)

fun sectorInvasion(cons: SectorInvasionEvent.() -> Unit) = listen<SectorInvasionEvent>(cons)

fun launchItem(cons: LaunchItemEvent.() -> Unit) = listen<LaunchItemEvent>(cons)

fun sectorLaunch(cons: SectorLaunchEvent.() -> Unit) = listen<SectorLaunchEvent>(cons)

fun blockDestroy(cons: BlockDestroyEvent.() -> Unit) = listen<BlockDestroyEvent>(cons)

fun blockBuildBegin(cons: BlockBuildBeginEvent.() -> Unit) = listen<BlockBuildBeginEvent>(cons)

fun blockBuildEnd(cons: BlockBuildEndEvent.() -> Unit) = listen<BlockBuildEndEvent>(cons)

fun unitDestroy(cons: UnitDestroyEvent.() -> Unit) = listen<UnitDestroyEvent>(cons)

fun unitCreate(cons: UnitCreateEvent.() -> Unit) = listen<UnitCreateEvent>(cons)

fun unitControl(cons: UnitControlEvent.() -> Unit) = listen<UnitControlEvent>(cons)

fun withdraw(cons: WithdrawEvent.() -> Unit) = listen<WithdrawEvent>(cons)

fun deposit(cons: DepositEvent.() -> Unit) = listen<DepositEvent>(cons)

fun tap(cons: TapEvent.() -> Unit) = listen<TapEvent>(cons)

fun onUpdate(cons: () -> Unit) = listenTrigger(Trigger.update, cons)

fun onDraw(cons: () -> Unit) = listenTrigger(Trigger.draw, cons)